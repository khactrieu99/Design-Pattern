package behavior.strategy;

/**
 * @author trieutk
 */
public class Algorithm1 implements Algorithm {
    @Override
    public boolean calculateTheSutability() {
        System.out.println("Algorithm 1 is OK");
        return true;
    }

    @Override
    public void execute() {
        System.out.println("Algorithm 1 executing");
    }
}
