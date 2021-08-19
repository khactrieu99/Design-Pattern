package behavior.visitor;

/**
 * @author trieutk
 */
public interface Book {
    void accept(Visitor visitor);
}
