

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class PatentDemo {
    public static void main(String[] args) {

        Random rand = new Random();

        // inventors for patents
        Inventor FirstInventor = new Inventor("Левит Михаил Захарович");
        Inventor SecondInventor = new Inventor("Колосов Алексей Алексеевич");
        Inventor ThirdInventor = new Inventor("Бондарь Кристина Евгеньевна");
        Inventor RecInventor_1 = new Inventor("Курдюмов Владимир Иванович");
        Inventor RecInventor_2 = new Inventor("Шевченко Святослав Владимирович");
        Inventor RecInventor_3 = new Inventor("Картавцев Юрий Иванович");

        //В классе PatentDemo создайте массив, содержащий 3 объекта класса Patent
        Patent[] patents =
                {
                        new Patent(208906, "ФРИКЦИОННОЕ ИЗДЕЛИЕ", FirstInventor),
                        new Patent(209983, "СМЁТКА-СТАМЕСКА ДЛЯ ПЧЕЛОВОДСТВА", SecondInventor),
                        new Patent(210927, "МАЛОГАБАРИТНАЯ ГРАДИРНЯ", ThirdInventor)
                };

        System.out.println("\nСортировка: ");

        System.out.println("\nСортировка по теме:\n");
        Arrays.sort(patents);
        System.out.println(Arrays.toString(patents));
        System.out.println();

        System.out.println("\nСортировка по номеру патента:\n");
        Arrays.sort(patents, new NumberComparator());
        System.out.println(Arrays.toString(patents));

        System.out.println("\nСортировка по автору патента:\n");
        Arrays.sort(patents, new InventorComparator());
        System.out.println(Arrays.toString(patents));

        PatentRecord[] patentRecords =
                {
                        new PatentRecord(208906, "ФРИКЦИОННОЕ ИЗДЕЛИЕ", FirstInventor),
                        new PatentRecord(209983, "СМЁТКА-СТАМЕСКА ДЛЯ ПЧЕЛОВОДСТВА", SecondInventor),
                        new PatentRecord(210927, "МАЛОГАБАРИТНАЯ ГРАДИРНЯ", ThirdInventor)
                };

        System.out.println("\nКласс Record objects ");

        System.out.println("\nСортировка по теме:\n");
        Arrays.sort(patentRecords);
        System.out.println(Arrays.toString(patentRecords));
        System.out.println();

        System.out.println("\nСортировка по номеру патента:\n");
        Arrays.sort(patentRecords, new NumberRecordComparator());
        System.out.println(Arrays.toString(patentRecords));

        System.out.println("\nСортировка по автору патента:\n");
        Arrays.sort(patentRecords, new InventorRecordComparator());
        System.out.println(Arrays.toString(patentRecords));


    }
}

class NumberComparator implements Comparator<Patent> {

    @Override
    public int compare(Patent o1, Patent o2) {
        return o2.getNumber() - o1.getNumber(); // вычитание между двумя числами, если полученное значение больше 0,
                                                // то первое число больше второго и так далее
    }
}

class InventorComparator implements Comparator<Patent>{

    @Override
    public int compare(Patent o1, Patent o2) {
        return o1.getInventor().getName().compareTo(o2.getInventor().getName()); //получаем объект изобретателя,
        // потом получаем имя и вызываем метод compareTo(стандартный метод класса String)
    }
}

class NumberRecordComparator implements Comparator<PatentRecord> {

    @Override
    public int compare(PatentRecord o1, PatentRecord o2) {
        return o2.number() - o1.number();
    }
}

class InventorRecordComparator implements Comparator<PatentRecord>{

    @Override
    public int compare(PatentRecord o1, PatentRecord o2) {
        return o1.inventor().getName().compareTo(o2.inventor().getName());
    }
}
