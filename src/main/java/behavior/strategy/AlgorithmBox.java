package behavior.strategy;

/**
 * @author trieutk
 */
public class AlgorithmBox {
    private Algorithm algorithm;

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void run() {
        if(algorithm.calculateTheSutability())
            algorithm.execute();
    }
}
