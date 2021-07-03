package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        List<Person> city = new ArrayList<>();

        Family family = FamilyFactory.getFamily("TT", "HTLD, PT, BT", 4, 10000L);
        Person person = new Person("trieu", 22, family);

        city.add(person);

        family = FamilyFactory.getFamily("TT", "HTLD, PT, BT", 4, 10000L);
        person = new Person("thanh", 22, family);

        city.add(person);

        family = FamilyFactory.getFamily("GT", "PNT, BT, HCM", 5, 1000000L);
        person = new Person("tuan", 60, family);

        city.add(person);
    }
}
