package behavior.visitor;

/**
 * @author trieutk
 */
public class VisitorImpl implements Visitor {
    @Override
    public void visit(NormalBook book) {
        System.err.println("Visit normal book");
    }

    @Override
    public void visit(CppBook book) {
        System.err.println("Visit Cpp book");
    }

    @Override
    public void visit(JavaBook book) {
        System.err.println("Visit Java book");
    }
}
