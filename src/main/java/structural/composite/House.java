package structural.composite;

/**
 * @author trieutk
 */
public class House implements Property {
    private int price;

    public House(int price) {
        this.price = price;
    }

    @Override
    public int getValue() {
        return price;
    }

    @Override
    public void destroy() {
        price = 0;
    }
}
