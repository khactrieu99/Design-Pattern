package structural.proxy;

/**
 * @author trieutk
 */
public class Hibernate implements Database {

    private MysqlDB db;
    private String host;
    private int port;

    public Hibernate() {
    }

    public Hibernate(String host, int port) {
        this.host = host;
        this.port = port;
    }

    private void init() {
        if(db == null) {
            if(host != null && port > 0)
                this.db = new MysqlDB(host, port);
            else this.db = new MysqlDB();
        }
    }

    @Override
    public void query(String query) {
        init();
        db.query(query);
    }

    @Override
    public void saveData(String data) {
        init();
        db.saveData(data);
    }
}
