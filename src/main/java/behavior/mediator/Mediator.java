package behavior.mediator;

/**
 * @author trieutk
 */
public interface Mediator {
    void register(UserInterface user);
    void send(UserInterface user, String message);
    void notify(UserInterface user, String message);
}
