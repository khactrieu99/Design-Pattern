package creational.prototype;

/**
 * @author trieutk
 */
public class Cell implements Cloneable {
    private int x;
    private int y;
    private String color;

    public Cell(String color) {
        this.x = -1;
        this.y = -1;
        this.color = color;
    }

    public Cell(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public Cell clone() {
        try {
            return (Cell)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
