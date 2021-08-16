package behavior.strategy;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        AlgorithmBox algorithmBox = new AlgorithmBox();

        algorithmBox.setAlgorithm(new Algorithm1());
        algorithmBox.run();

        algorithmBox.setAlgorithm(new Algorithm2());
        algorithmBox.run();
    }
}
