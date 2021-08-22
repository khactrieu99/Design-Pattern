package behavior.iterator;

import java.util.List;

/**
 * @author trieutk
 */
public class FacebookIterator implements ProfileIterator {
    private int profileId;
    private String iteType;
    private List<Relationship> cache;
    private int curPos;

    public FacebookIterator(int profileId, String iteType) {
        this.profileId = profileId;
        this.iteType = iteType;
        this.curPos = 0;
    }

    private void init() {
        cache = DataCenter.getInstance().GetNetwork(profileId, iteType);
    }

    @Override
    public boolean hasNext() {
        if(cache==null) {
            init();
        }

        return curPos < cache.size();
    }

    @Override
    public int next() {
        if(hasNext()) {
            Relationship relationship = cache.get(curPos++);
            return relationship.getUser();
        }

        return -1;
    }
}
