package behavior.command;

/**
 * @author trieutk
 */
public class UndoCommand extends Command {
    public UndoCommand(Document document, String text) {
        super(document, text);
        this.document.write(text);
    }

    @Override
    public void execute() {
        this.document.remove();
    }
}
