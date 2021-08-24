package behavior.command;

/**
 * @author trieutk
 */
public abstract class Element {
    protected Application application;

    protected void setApplication(Application application) {
        this.application = application;
    }

    public abstract void click();
}
