package behavior.visitor;

/**
 * @author trieutk
 */
public interface Visitor {
    void visit(NormalBook book);
    void visit(CppBook book);
    void visit(JavaBook book);
}
