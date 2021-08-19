package behavior.observer;

/**
 * @author trieutk
 */
public class ErrorSubcriber implements Subcriber {

    @Override
    public void update(String message) {
        System.err.println("ERROR: " + message);
    }
}
