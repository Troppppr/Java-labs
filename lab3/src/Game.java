
public class Game {
    private Competition[] competitions;

    private Athlete[] athletes;

    public Game(Competition[] competitions, Athlete[] athletes) {
        this.competitions = competitions;
        this.athletes = athletes;
    }

    public void start(){
        for (Competition i:
                competitions) {
            i.start(athletes);
        }
        for (Athlete i:
                athletes) {
            if(i.getReady()){
                System.out.println(i.getName() + " прошел все состязания и стал победителем");
            }

        }
    }
}