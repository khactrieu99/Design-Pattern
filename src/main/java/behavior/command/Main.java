package behavior.command;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        Application application = new Application();

        RedoButton redoButton = new RedoButton();
        redoButton.setApplication(application);

        UndoButton undoButton = new UndoButton();
        undoButton.setApplication(application);

        application.write("T");
        application.write("r");
        System.out.println(application.read());

        undoButton.click();
        System.out.println(application.read());

        redoButton.click();
        application.write("khac trieu");
        System.out.println(application.read());
    }
}
