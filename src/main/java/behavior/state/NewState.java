package behavior.state;

/**
 * @author trieutk
 */
public class NewState implements State {
    @Override
    public void handle() {
        System.out.println("New state handling");
    }
}
