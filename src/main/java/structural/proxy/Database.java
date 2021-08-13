package structural.proxy;

/**
 * @author trieutk
 */
public interface Database {
    void query(String query);
    void saveData(String data);
}
