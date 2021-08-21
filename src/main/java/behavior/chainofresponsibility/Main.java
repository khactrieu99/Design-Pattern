package behavior.chainofresponsibility;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger(Level.INFO);
        Logger warningLogger = new WarningLogger(Level.WARNING);
        Logger errorLogger = new ErrorLogger(Level.ERROR);

        infoLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(errorLogger);

        infoLogger.Log(Level.ERROR, "NullPointerException");
    }
}
