

// 1. Напишите класс Inventor, имеющий нестатическое поле name.
//      Напишите класс Patent, имеющий нестатические поля
//      - number (номер патента),
//      - topic (тема изобретения),
//      - inventor (типа Inventor). Оба класса в виде POJO.

import java.util.Comparator;
import java.util.Objects;
/**
 * Интерфейс Comparable задает одно основное правило сравнение для объектов. Для его работы нужно переопределить метод compareTo (он внизу)
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
 * сравнение
 * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // В строке проверяет не является ли сравниваемый объект с этим.  Саша = Саша
        if (o == null || getClass() != o.getClass()) return false; // объект = нулю или объектом того же класса или нет, то есть Саша человек = Саша человек
        Patent patent = (Patent) o; // преобразование типа Object к типу Patent, чтобы дальше можно было сравнивать по полям
        return number == patent.number && topic.equals(patent.topic) && inventor.equals(patent.inventor); //Сравнения по полям
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, topic, inventor);
    }

    @Override
    public String toString() {
        return "Патент № " + number +
                ", Тема: " + topic  +
                "; Автор: " + inventor;
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
    }  //получаем объект изобретателя, получаем имя и вызываем метод compareTo, это стандартный метод класса String


}
