package behavior.iterator;

/**
 * @author trieutk
 */
public interface SocialNetwork {
    ProfileIterator createFriendIterator();
    ProfileIterator creatCoWorkerIterator();
}
