package creational.abstractfactory;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        Factory woodFactory = FurnitureFactory.GetFactory(ProductType.WOOD);

        Chair woodChair = woodFactory.createChair();
        Table woodTable = woodFactory.createTable();

        Factory plasticFactory = FurnitureFactory.GetFactory(ProductType.PLASTIC);

        Chair plasticChair = plasticFactory.createChair();
        Table plasticTable = plasticFactory.createTable();
    }
}
