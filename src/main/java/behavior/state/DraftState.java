package behavior.state;

/**
 * @author trieutk
 */
public class DraftState implements State {
    @Override
    public void handle() {
        System.out.println("Draft state handling");
    }
}
