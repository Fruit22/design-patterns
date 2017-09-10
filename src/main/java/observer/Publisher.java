package observer;

/**
 * Created by fruit on 10.09.2017.
 */
public interface Publisher {
    public void deleteSubscriber(Subscriber subscriber);
    public void addSubscriber(Subscriber subscriber);
    public void notifySubscriber();
}
