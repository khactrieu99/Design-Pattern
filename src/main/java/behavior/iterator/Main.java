package behavior.iterator;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        Facebook facebook = new Facebook(1);

        ProfileIterator iterator = facebook.createFriendIterator();

        System.out.println("LIST FRIEND OF USER HAS ID: " + facebook.getProfileId());
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = facebook.creatCoWorkerIterator();
        System.out.println("LIST CO-WORKER OF USER HAS ID: " + facebook.getProfileId());
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
