package creational.builder;

/**
 * @author trieutk
 */
public class Main {

    public static void main(String[] args) {
        Game.GameBuilder gameBuilder = new Game.GameBuilder();
        Game game = gameBuilder.playWithGPU(true).restrictTheAge(18).build();
        System.out.println(game);
    }
}
