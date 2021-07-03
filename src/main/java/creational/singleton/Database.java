package creational.singleton;

/**
 * @author trieutk
 */
public class Database {
    private int Connection;

    private static class SingletonHolder {
        private static Database INSTANCE = new Database();
    }

    public static Database getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private Database() {
        this.Connection = 0;
    }

    public void connect() {
        this.Connection++;
    }

    public int count() {
        return this.Connection;
    }

}
