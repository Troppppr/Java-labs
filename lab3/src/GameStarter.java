
public class GameStarter {
    public static void main(String[] args) {
        Athlete[] athletes = {
                new Athlete("Alex Scott"),
                new Athlete("Ben Cook"),
                new Athlete("Christopher Nolan"),
                new Athlete("Damian Lewis")
        };

        Skiing skiing = new Skiing(25);
        Shooting shooting = new Shooting( 50);
        Running running = new Running();

        Game game = new Game(new Competition[]{skiing, shooting, running}, athletes);

        game.Start();
    }
}
