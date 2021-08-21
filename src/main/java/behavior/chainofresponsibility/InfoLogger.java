package behavior.chainofresponsibility;

/**
 * @author trieutk
 */
public class InfoLogger extends Logger {
    public InfoLogger(Level level) {
        super(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("INFO: " + message);
    }
}
