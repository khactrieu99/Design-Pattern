package creational.abstractfactory;

/**
 * @author trieutk
 */
public class FurnitureFactory {
    public static final Factory GetFactory(ProductType type) {
        switch (type) {
            case PLASTIC:
                return new PlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                return new PlasticFactory();
        }
    }
}
