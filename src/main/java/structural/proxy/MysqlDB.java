package structural.proxy;

/**
 * @author trieutk
 */
public class MysqlDB implements Database {
    private String host;
    private int port;

    public MysqlDB() {
        this("localhost", 3306);
    }

    public MysqlDB(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public void query(String query) {
        System.out.println("MysqlDB query on " + host + ":" + port + ": " + query);
    }

    @Override
    public void saveData(String data) {
        System.out.println("MysqlDB save data on " + host + ":" + port + ": " + data);
    }
}
