package behavior.command;

/**
 * @author trieutk
 */
public class RedoButton extends Element {
    @Override
    public void click() {
        this.application.redo();
    }
}
