package behavior.visitor;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        Book normal = new NormalBook();
        Book cppBook = new CppBook();
        Book javaBook = new JavaBook();

        Visitor visitor = new VisitorImpl();
        normal.accept(visitor);
        cppBook.accept(visitor);
        javaBook.accept(visitor);
    }
}
