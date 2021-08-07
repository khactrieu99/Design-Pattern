package creational.factorymethod;

/**
 * @author trieutk
 */
public class BankFactory {
    public static final Bank getBank(String bankname) {
        switch (bankname) {
            case "VPBank":
                return new VPBank();
            case  "Vietcombank":
                return new VietcomBank();
            default:
                return new VPBank();
        }
    }
}
