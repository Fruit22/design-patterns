package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fruit on 10.09.2017.
 */
public class PublisherImpl implements Publisher {
    List<Subscriber> subscribers = new ArrayList<>();
    String msg = new String();

    @Override
    public void deleteSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscriber() {
        for (Subscriber subscriber: subscribers) {
            subscriber.update(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifySubscriber();
    }
}
