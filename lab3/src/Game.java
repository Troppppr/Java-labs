

public class Game {
    Competition[] competitions;
    Athlete[] athletes;

    public Game(Competition[] competitions, Athlete[] athletes) {
        this.competitions = competitions;
        this.athletes = athletes;
    }

    public void Start(){
        competitions[2].Start(competitions[1].Start(competitions[0].Start(athletes)));
    }
}
