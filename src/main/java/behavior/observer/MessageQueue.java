package behavior.observer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author trieutk
 */
public class MessageQueue {
    private Map<String, List<Subcriber>> topics = new HashMap<>();

    void Subcribe(String topic, Subcriber subcriber) {
        if(topics.containsKey(topic)) {
            List<Subcriber> subcribers = topics.get(topic);
            subcribers.add(subcriber);
            topics.put(topic, subcribers);
        } else {
            topics.put(topic, Arrays.asList(subcriber));
        }
    }

    void UnSubcribe(String topic, Subcriber subcriber) {
        if(topics.containsKey(topic)) {
            topics.remove(subcriber);
        }
    }

    void Notify(String topic, String message) {
        for(Subcriber subcriber: topics.get(topic)) {
            subcriber.update(message);
        }
    }
}
