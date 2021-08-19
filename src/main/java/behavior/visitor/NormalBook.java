package behavior.visitor;

/**
 * @author trieutk
 */
public class NormalBook implements Book {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
