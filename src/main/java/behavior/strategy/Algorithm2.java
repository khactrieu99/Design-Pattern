package behavior.strategy;

/**
 * @author trieutk
 */
public class Algorithm2 implements Algorithm {
    @Override
    public boolean calculateTheSutability() {
        System.out.println("Algorithm 2 is not OK");
        return false;
    }

    @Override
    public void execute() {
        System.out.println("Algorithm 2 executing");
    }
}
