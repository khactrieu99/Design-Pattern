package behavior.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author trieutk
 */
public class Document {
    private Stack<String> content = new Stack<>();

    public void remove() {
        if(!content.empty()) content.pop();
    }

    public void write(String text) {
        content.push(text);
    }

    public String read() {
        String rs = "";

        Iterator<String> ite = content.iterator();
        while(ite.hasNext()) {
            String text = ite.next();
            rs += text + (ite.hasNext() ? " " : "");
        }

        return rs;
    }
}
