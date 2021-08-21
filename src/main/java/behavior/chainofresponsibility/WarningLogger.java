package behavior.chainofresponsibility;

/**
 * @author trieutk
 */
public class WarningLogger extends Logger {
    public WarningLogger(Level level) {
        super(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("WARNING: " + message);
    }
}
