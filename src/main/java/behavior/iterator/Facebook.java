package behavior.iterator;

/**
 * @author trieutk
 */
public class Facebook implements SocialNetwork {
    private int profileId;

    public Facebook (int profileId) {
        this.profileId = profileId;
    }

    public int getProfileId() {
        return profileId;
    }

    @Override
    public FacebookIterator createFriendIterator() {
        return new FacebookIterator(profileId, "FRIEND");
    }

    @Override
    public FacebookIterator creatCoWorkerIterator() {
        return new FacebookIterator(profileId, "CO-WORKER");
    }
}
