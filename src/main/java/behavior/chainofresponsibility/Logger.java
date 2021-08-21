package behavior.chainofresponsibility;

/**
 * @author trieutk
 */
public abstract class Logger {
    protected Level level;
    protected Logger nextLogger;

    public Logger(Level level) {
        this.level = level;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void Log(Level level, String message) {
        if(this.level.getLevel() <= level.getLevel()) {
            this.writeMessage(message);
        }
        if(nextLogger!=null) {
            nextLogger.Log(level, message);
        }
    }

    protected abstract void writeMessage(String message);
}
