package creational.abstractfactory;

/**
 * @author trieutk
 */
public class PlasticFactory implements Factory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
