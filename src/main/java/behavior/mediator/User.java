package behavior.mediator;

/**
 * @author trieutk
 */
public class User extends UserInterface {
    public User(Mediator server, String name) {
        super(server, name);
    }

    @Override
    public void onReceive(String message) {
        System.err.println("----");
        System.err.println("USER " + name + " has receive message: " + message);
    }

    @Override
    public void send(String message) {
        System.err.println("----");
        System.out.println("USER " + name + " sending message: " + message);
        server.send(this, name + ": " + message);
    }
}
