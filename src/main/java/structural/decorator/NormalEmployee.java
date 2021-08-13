package structural.decorator;

/**
 * @author trieutk
 */
public class NormalEmployee implements EmmployeeInterface {
    @Override
    public void check() {
        System.out.println("Do daily check");
    }

    @Override
    public void doTask() {
        System.out.println("Do task");
    }
}
