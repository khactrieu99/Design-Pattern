package behavior.visitor;

/**
 * @author trieutk
 */
public class CppBook implements ProgrammingBook {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void getResource() {
        System.err.println("From america");
    }
}
