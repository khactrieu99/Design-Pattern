package behavior.templatemethod;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        GreenOrc greenOrc = new GreenOrc();
        greenOrc.run();

        RedOrc redOrc = new RedOrc();
        redOrc.run();
    }
}
