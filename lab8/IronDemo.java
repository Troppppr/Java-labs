package ru.lab8;

import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class IronDemo {
    public static void main(String[] args) {
        List<Iron> irons = List.of(
                new Iron(1,"Philips GC4563/30", "Philips","фиолетовый",5499,4.8),
                new Iron(2,"Morphy Richards Saturn", "Morphy Richards","синий",6799,4.8),
                new Iron(3,"Philips GC4905/40","Philips","бежевый",5599,4),
                new Iron(4,"Braun TS 735 TP","Braun","серый",	4599,	3.8),
                new Iron(5,"Tefal FV3968"	,"Tefal"	,"синий"	,3999	,4.4),
                new Iron(6,"Polaris PIR 2457K"	,"Polaris"	,"фиолетовый"	,1699	,5.3),
                new Iron(7,"Bosch TDA30EASY"	,"Bosch"	,"серый"	,3499	,4.6),
                new Iron(8,"Tefal FV9834E0"	,"Tefal"	,"черный"	,8499	,4.8),
                new Iron(9,"Philips DST6008/20"	,"Philips"	,"синий"	,3499	,4.5),
                new Iron(10,"Braun TS 525 A"	,"Braun"	,"голубой"	,3699	,5)
        );

//        1.	Отсортируйте утюги по наименованию.
        System.out.println("1. Сортировка по наименованию:\n" + irons.stream()
                .sorted(comparing(Iron::name)).toList());

//        2.	Выведите в консоль сортированный список марок утюгов.
        System.out.println("\n2. Сортировка по цене:\n" + irons.stream()
                .sorted(comparing(Iron::mark)).toList());

//       3.	Найдите утюг с наименьшей оценкой покупателей
        System.out.println("\n3. Наименьшая оценка:\n" + irons.stream()
                .min(comparing(Iron::rate)));


//        4.	Создайте коллекцию утюгов с ценой менее 3 тыс. руб.
                System.out.println("\n4. Количество утюгов менее 3 тыс руб: \n" + irons.stream()
                        .filter(x -> x.price()<3000).count());


////        4.	Создайте коллекцию наушников не черного цвета.
//        List<Iron> notBlack = irons.stream()
//                .filter(x -> !x.colour().equals("чёрный")).toList();
//        System.out.println("\nНе чёрные наушники\n" + notBlack);

//        5.	Рассчитайте среднюю оценку покупателей, используя числовой стрим.
        System.out.println("\n5. Средняя оценка покупателей: \n" + irons.stream()
                .mapToDouble(Iron::rate).average());

//      6.	Рассчитайте количество представленных цветов утюгов.
        System.out.println("\n6. Количество цветов:\n" + irons.stream()
                .collect(groupingBy(Iron::colour, counting())));


//      7.	Проверьте, у всех ли утюгов оценка покупателей больше 4.
        System.out.println("\n7. Все утюги с оценкой больше 4: \n" + irons.stream()
                .allMatch(x -> x.rate() > 4));

//       8.	Проверьте, есть ли в продаже утюг красного цвета.
        System.out.println("\n8. Утюг красного цвета присутствует: \n" + irons.stream()
                .anyMatch(x -> x.colour().equals("Red")));

//       9.	Найдите самый дешёвый утюг, используя minBy().
        System.out.println("\n9. Cамый дешёвый утюг: \n" + irons.stream()
                .collect(minBy(comparing(Iron:: price))));

//      10.	Разделите все утюги на 2 коллекции: с оценкой больше 4,5 и меньше 4,5.
        Map<Boolean, List<Iron>> IronRates = irons.stream()
                .collect(partitioningBy(x -> x.rate() > 4.5f));
        System.out.println("\n10.1 Оценка больше 4.5:\n" + IronRates.get(true)
                + "\n10.2 Оценка меньше 4.5\n" + IronRates.get(false));

//     	11.	Сгруппируйте все утюги по маркам.
        System.out.println("\n11. Количество у марки:\n" + irons.stream()
                .collect(groupingBy(Iron::mark, counting())));
//      12.	Для каждой марки посчитайте количество утюгов и минимальную цену.
        System.out.println("\n12. количество утюгов и минимальную цену:\n" + irons.stream()
                .collect(groupingBy(Iron::mark, minBy(comparing(Iron:: price)))));

        System.out.println("\n13. ТОП-5 утюгов по оценкам покупателей:\n" + irons.stream()
                .sorted(comparing(Iron::rate)).toList());
    }
}
