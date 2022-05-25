

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
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
        Arrays.sort(patents, new Patent.NumberComparator());
        System.out.println(Arrays.toString(patents));

        System.out.println("\nСортировка по автору патента:\n");
        Arrays.sort(patents, new Patent.InventorComparator());
        System.out.println(Arrays.toString(patents));

        PatentRecord[] patentRecords =
                {
                        new PatentRecord(2772118, "ПОЧВООБРАБАТЫВАЮЩИЙ КАТОК", RecInventor_1),
                        new PatentRecord(207650, "РЕМЕННАЯ ПЕРЕДАЧА", RecInventor_2),
                        new PatentRecord(205755, "КОРПУС РАМОЧНОГГО УЛЬЯ", RecInventor_3)
                };

        System.out.println("\nКласс Record objects ");

        System.out.println("\nСортировка по теме:\n");
        Arrays.sort(patentRecords);
        System.out.println(Arrays.toString(patentRecords));
        System.out.println();

        System.out.println("\nСортировка по номеру патента:\n");
        Arrays.sort(patentRecords, new PatentRecord.NumberComparator());
        System.out.println(Arrays.toString(patentRecords));

        System.out.println("\nСортировка по автору патента:\n");
        Arrays.sort(patentRecords, new PatentRecord.InventorComparator());
        System.out.println(Arrays.toString(patentRecords));
    }
}
