package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author trieutk
 */
public class FamilyFactory {
    static Map<String, Family> factory = new HashMap();

    public static Family getFamily(String name, String address, int members, long asset) {
        if(!factory.containsKey(name)) {
            Family newFamily = new Family(name, address, members, asset);
            factory.put(name, newFamily);
        }

        return factory.get(name);
    }
}
