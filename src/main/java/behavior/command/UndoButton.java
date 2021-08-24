package behavior.command;

/**
 * @author trieutk
 */
public class UndoButton extends Element {
    @Override
    public void click() {
        this.application.undo();
    }
}
