

// 1. �������� ����� Inventor, ������� ������������� ���� name.
//      �������� ����� Patent, ������� ������������� ����
//      - number (����� �������),
//      - topic (���� �����������),
//      - inventor (���� Inventor). ��� ������ � ���� POJO.

import java.util.Comparator;
import java.util.Objects;
/**
 * ��������� Comparable ������ ���� �������� ������� ��������� ��� ��������. ��� ��� ������ ����� �������������� ����� compareTo (�� �����)
 * */
public class Patent implements Comparable<Patent> {
    private int number;
    private String topic;
    private Inventor inventor;

    public Patent(int number, String topic, Inventor inventor) {
        this.number = number;
        this.topic = topic;
        this.inventor = inventor;
    }
/**
 * ���������
 * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // � ������ ��������� �� �������� �� ������������ ������ � ����.  ���� = ����
        if (o == null || getClass() != o.getClass()) return false; // ������ = ���� ��� �������� ���� �� ������ ��� ���, �� ���� ���� ������� = ���� �������
        Patent patent = (Patent) o; // �������������� ���� Object � ���� Patent, ����� ������ ����� ���� ���������� �� �����
        return number == patent.number && topic.equals(patent.topic) && inventor.equals(patent.inventor); //��������� �� �����
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, topic, inventor);
    }

    @Override
    public String toString() {
        return "������ � " + number +
                ", ����: " + topic  +
                "; �����: " + inventor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Inventor getInventor() {
        return inventor;
    }

    public void setInventor(Inventor inventor) {
        this.inventor = inventor;
    }

    @Override
    public int compareTo(Patent o) {
        return this.getTopic().compareTo(o.getTopic());
    }  //�������� ������ ������������, �������� ��� � �������� ����� compareTo, ��� ����������� ����� ������ String


}
