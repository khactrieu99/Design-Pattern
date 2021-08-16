package behavior.memento;

import java.util.Stack;

/**
 * @author trieutk
 */
public class CareTaker {
    private Stack<Move> history = new Stack<>();

    public void addNew(Move move) {
        history.push(move);
    }

    public Move getLast() {
        if(!history.empty())
            return history.pop();
        return null;
    }
}
