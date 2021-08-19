package behavior.observer;

/**
 * @author trieutk
 */
public class SendMessageSubcriber implements Subcriber {
    @Override
    public void update(String message) {
        System.out.println("SENDING MESSAGE: " + message);
    }
}
