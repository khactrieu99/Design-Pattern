package behavior.chainofresponsibility;

/**
 * @author trieutk
 */
public class ErrorLogger extends Logger {
    public ErrorLogger(Level level) {
        super(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.err.println("ERROR: " + message);
    }
}
