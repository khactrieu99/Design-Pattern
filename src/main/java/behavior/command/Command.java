package behavior.command;

/**
 * @author trieutk
 */
public abstract class Command {
    protected Document document;
    protected String text;

    public Command(Document document, String text) {
        this.document = document;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public abstract void execute();
}
