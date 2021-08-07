package creational.abstractfactory;

/**
 * @author trieutk
 */
public class WoodFactory implements Factory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
