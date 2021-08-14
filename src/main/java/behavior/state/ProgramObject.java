package behavior.state;

/**
 * @author trieutk
 */
public class ProgramObject {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void react() {
        System.out.println("Program object react based on their status");
        state.handle();
    }
}
