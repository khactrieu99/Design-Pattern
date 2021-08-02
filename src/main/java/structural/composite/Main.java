package structural.composite;

/**
 * @author trieutk
 */
public class Main {

    public static void main(String[] args) {
        ResidentialArea residentialArea = new ResidentialArea();
        residentialArea.addToBelongs(new House(10));
        residentialArea.addToBelongs(new House(20));

        System.out.println(residentialArea.getValue());
        residentialArea.destroy();
        System.out.println(residentialArea.getValue());
    }
}
