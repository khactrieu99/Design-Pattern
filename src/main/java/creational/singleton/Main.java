package creational.singleton;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        db1.connect();
        System.out.println(Database.getInstance().count());

        Database db2 = Database.getInstance();
        db2.connect();
        System.out.println(Database.getInstance().count());
    }
}
