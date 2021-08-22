package behavior.iterator;

/**
 * @author trieutk
 */
public class Relationship {
    private int user;
    private String relationship;

    public Relationship(int user, String relationship) {
        this.user = user;
        this.relationship = relationship;
    }

    public int getUser() {
        return user;
    }

    public String getRelationship() {
        return relationship;
    }
}