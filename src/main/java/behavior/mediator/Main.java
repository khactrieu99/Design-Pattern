package behavior.mediator;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        Mediator server = new Server();

        UserInterface user1 = new User(server, "trieu");
        UserInterface user2 = new User(server, "ha");
        UserInterface user3 = new User(server, "manh");
        UserInterface user4 = new User(server, "hoang");

        user1.send("hello cac ban");
        user2.send("heelo trieu");
    }
}
