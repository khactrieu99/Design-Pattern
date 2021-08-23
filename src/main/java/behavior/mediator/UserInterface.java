package behavior.mediator;

/**
 * @author trieutk
 */
public abstract class UserInterface  {
    protected Mediator server;
    protected String name;

    public UserInterface(Mediator server, String name) {
        this.server = server;
        this.name = name;

        server.register(this);
    }

    public abstract void onReceive(String message);
    public abstract void send(String message);
}
