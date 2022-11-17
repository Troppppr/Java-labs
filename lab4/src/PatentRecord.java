

import java.util.Comparator;

public record PatentRecord(int number, String topic, Inventor inventor) implements Comparable<PatentRecord>{

    @Override
    public int compareTo(PatentRecord o) {
        return topic.compareTo(o.topic);
    }

}
