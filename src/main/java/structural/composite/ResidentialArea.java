package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author trieutk
 */
public class ResidentialArea implements Property {

    private List<Property> belongs;

    public void addToBelongs(Property property) {
        belongs.add(property);
    }

    public ResidentialArea() {
        belongs = new ArrayList<>();
    }

    @Override
    public int getValue() {
        int sum = 0;

        for(Property property: belongs) {
            sum += property.getValue();
        }

        return sum;
    }

    @Override
    public void destroy() {
        for(Property property: belongs) {
            property.destroy();
        }
    }
}
