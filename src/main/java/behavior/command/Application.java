package behavior.command;

import java.util.Stack;

/**
 * @author trieutk
 */
public class Application {
    private Stack<Command> undoCommands = new Stack<>();
    private Stack<Command> redoCommands = new Stack<>();
    private Document document = new Document();

    public Application() {

    }

    public void addElement(Element element) {
        element.setApplication(this);
    }

    public void redo() {
        if(!redoCommands.empty()) {
            Command redoCommand = redoCommands.pop();
            redoCommand.execute();
            Command undoCommand = new UndoCommand(this.document, redoCommand.getText());
            undoCommands.push(undoCommand);
        }
    }

    public void undo() {
        if(!undoCommands.empty()) {
            Command undoCommand = undoCommands.pop();
            undoCommand.execute();
            Command redoCommand = new RedoCommand(this.document, undoCommand.getText());
            redoCommands.push(redoCommand);
        }
    }

    public void write(String text) {
        Command undoCommand = new UndoCommand(this.document, text);
        undoCommands.push(undoCommand);
        redoCommands.clear();
    }

    public String read() {
        return document.read();
    }
}
