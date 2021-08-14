package behavior.state;

/**
 * @author trieutk
 */
public class DeletedState implements State {
    @Override
    public void handle() {
        System.out.println("Deleted state handling");
    }
}
