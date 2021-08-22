package behavior.iterator;

import java.util.*;

/**
 * @author trieutk
 */
public class DataCenter {
    private Map<Integer, List<Relationship>> network = new HashMap<>();

    private static class SingletonHolder {
        private static final DataCenter INSTANCE = new DataCenter();
    }

    private DataCenter() {
        network.put(1, Arrays.asList(
                new Relationship(2, "FRIEND"),
                new Relationship(3, "CO-WORKER"),
                new Relationship(4, "CO_WORKER"),
                new Relationship(5, "FRIEND"),
                new Relationship(6, "CO-WORKER"),
                new Relationship(7, "CO_WORKER"),
                new Relationship(8, "FRIEND"),
                new Relationship(9, "CO-WORKER"),
                new Relationship(10, "CO_WORKER"),
                new Relationship(11, "FRIEND"),
                new Relationship(12, "CO-WORKER"),
                new Relationship(13, "CO_WORKER"),
                new Relationship(14, "FRIEND"),
                new Relationship(15, "CO-WORKER"),
                new Relationship(16, "CO_WORKER")
        ));

        network.put(2, Arrays.asList(
                new Relationship(1, "FRIEND"),
                new Relationship(3, "CO-WORKER"),
                new Relationship(4, "CO_WORKER"),
                new Relationship(5, "FRIEND"),
                new Relationship(6, "CO-WORKER"),
                new Relationship(7, "CO_WORKER"),
                new Relationship(8, "FRIEND"),
                new Relationship(9, "CO-WORKER"),
                new Relationship(10, "CO_WORKER"),
                new Relationship(11, "FRIEND"),
                new Relationship(12, "CO-WORKER"),
                new Relationship(13, "CO_WORKER"),
                new Relationship(14, "FRIEND"),
                new Relationship(15, "CO-WORKER"),
                new Relationship(16, "CO_WORKER")
        ));
    }

    public static DataCenter getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public List<Relationship> GetNetwork(int profileId, String type) {
        List<Relationship> rs = new ArrayList<>();
        List<Relationship> relationships = network.get(profileId);

        for(Relationship relationship: relationships) {
            if(relationship.getRelationship() == type) rs.add(relationship);
        }

        return rs;
    }

}
