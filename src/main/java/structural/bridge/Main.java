package structural.bridge;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Blue());
        Circle circle = new Circle(new Green());

        rectangle.draw();
        circle.draw();
    }
}
