
public interface Competition {
    default Athlete[] start(Athlete[] athletes) {
        return new Athlete[0];
    }
}
