package behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author trieutk
 */
public class Server implements Mediator {
    private List<UserInterface> userInRoom = new ArrayList<>();

    public void register(UserInterface user) {
        userInRoom.add(user);
    }

    @Override
    public void send(UserInterface user, String message) {
        System.err.println("----");
        this.notify(user, message);
    }

    @Override
    public void notify(UserInterface user, String message) {
        for(UserInterface u: userInRoom) {
            if(!u.equals(user)) {
                u.onReceive(message);
            }
        }
    }
}
