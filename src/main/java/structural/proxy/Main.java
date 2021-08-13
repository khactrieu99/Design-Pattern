package structural.proxy;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        Hibernate hibernate = new Hibernate();
        hibernate.query("SELECT * FROM table t where t.name = \"TRUONG KHAC TRIEU\"");
        hibernate.saveData("{name: 'TRUONG KHAC TRIEU'}");
    }
}
