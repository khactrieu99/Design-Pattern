package structural.bridge;

/**
 * @author trieutk
 */
public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
