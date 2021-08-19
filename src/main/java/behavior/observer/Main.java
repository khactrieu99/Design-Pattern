package behavior.observer;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();

        Subcriber errorSubcriber = new ErrorSubcriber();
        messageQueue.Subcribe("ERROR", errorSubcriber);

        Subcriber sendMessageSubcriber = new SendMessageSubcriber();
        messageQueue.Subcribe("SEND MESSAGE", sendMessageSubcriber);

        messageQueue.Notify("ERROR", "AT DATE NOW, ERROR ...");
        messageQueue.Notify("SEND MESSAGE", "Heello all");

        messageQueue.UnSubcribe("SEND MESSAGE", sendMessageSubcriber);
    }
}
