package observer;

/**
 * Created by fruit on 10.09.2017.
 */
public class SubscriberImplOne implements Subscriber {
    @Override
    public void update(String msg) {
        System.out.println("I'm subscriber One: " + msg);
    }
}
