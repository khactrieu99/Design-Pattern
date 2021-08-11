package structural.bridge;

/**
 * @author trieutk
 */
public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + color.getColor() + " Rectangle");
    }
}