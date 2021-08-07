package creational.factorymethod;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        Bank bank1 = BankFactory.getBank("VPBank");
        Bank bank2 = BankFactory.getBank("Vietcombank");

        System.out.println(bank1.getBankname());
        System.out.println(bank2.getBankname());
    }
}
