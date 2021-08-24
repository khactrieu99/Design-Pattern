package behavior.command;

/**
 * @author trieutk
 */
public class RedoCommand extends Command {
    public RedoCommand(Document document, String text) {
        super(document, text);
    }

    @Override
    public void execute() {
        this.document.write(text);
    }
}
