

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class PatentDemo {
    public static void main(String[] args) {

        Random rand = new Random();

        // inventors for patents
        Inventor FirstInventor = new Inventor("����� ������ ���������");
        Inventor SecondInventor = new Inventor("������� ������� ����������");
        Inventor ThirdInventor = new Inventor("������� �������� ����������");
        Inventor RecInventor_1 = new Inventor("�������� �������� ��������");
        Inventor RecInventor_2 = new Inventor("�������� ��������� ������������");
        Inventor RecInventor_3 = new Inventor("��������� ���� ��������");

        //� ������ PatentDemo �������� ������, ���������� 3 ������� ������ Patent
        Patent[] patents =
                {
                        new Patent(208906, "����������� �������", FirstInventor),
                        new Patent(209983, "�̨���-�������� ��� ������������", SecondInventor),
                        new Patent(210927, "�������������� ��������", ThirdInventor)
                };

        System.out.println("\n����������: ");

        System.out.println("\n���������� �� ����:\n");
        Arrays.sort(patents);
        System.out.println(Arrays.toString(patents));
        System.out.println();

        System.out.println("\n���������� �� ������ �������:\n");
        Arrays.sort(patents, new NumberComparator());
        System.out.println(Arrays.toString(patents));

        System.out.println("\n���������� �� ������ �������:\n");
        Arrays.sort(patents, new InventorComparator());
        System.out.println(Arrays.toString(patents));

        PatentRecord[] patentRecords =
                {
                        new PatentRecord(208906, "����������� �������", FirstInventor),
                        new PatentRecord(209983, "�̨���-�������� ��� ������������", SecondInventor),
                        new PatentRecord(210927, "�������������� ��������", ThirdInventor)
                };

        System.out.println("\n����� Record objects ");

        System.out.println("\n���������� �� ����:\n");
        Arrays.sort(patentRecords);
        System.out.println(Arrays.toString(patentRecords));
        System.out.println();

        System.out.println("\n���������� �� ������ �������:\n");
        Arrays.sort(patentRecords, new NumberRecordComparator());
        System.out.println(Arrays.toString(patentRecords));

        System.out.println("\n���������� �� ������ �������:\n");
        Arrays.sort(patentRecords, new InventorRecordComparator());
        System.out.println(Arrays.toString(patentRecords));


    }
}

class NumberComparator implements Comparator<Patent> {

    @Override
    public int compare(Patent o1, Patent o2) {
        return o2.getNumber() - o1.getNumber(); // ��������� ����� ����� �������, ���� ���������� �������� ������ 0,
                                                // �� ������ ����� ������ ������� � ��� �����
    }
}

class InventorComparator implements Comparator<Patent>{

    @Override
    public int compare(Patent o1, Patent o2) {
        return o1.getInventor().getName().compareTo(o2.getInventor().getName()); //�������� ������ ������������,
        // ����� �������� ��� � �������� ����� compareTo(����������� ����� ������ String)
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
