package behavior.state;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        ProgramObject programObject = new ProgramObject();

        programObject.setState(new NewState());
        programObject.react();

        programObject.setState(new DeletedState());
        programObject.react();

        programObject.setState(new DraftState());
        programObject.react();
    }
}
