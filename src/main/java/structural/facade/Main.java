package structural.facade;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCreditCard("trieutrng@gmail.com");
        ShopFacade.getInstance().buyProductByPaypal("trieutrng@gmail.com");
    }
}
