package observer;

/**
 * Created by fruit on 10.09.2017.
 */
public class Example {
    public static void main(String[] args) {
        PublisherImpl publisher = new PublisherImpl();
        Subscriber one = new SubscriberImplOne();
        Subscriber two = new SubscriberImplTwo();

        publisher.addSubscriber(one);
        publisher.setMsg("Wow!");

        System.out.println();

        publisher.addSubscriber(two);
        publisher.setMsg("Lol");

        System.out.println();

        publisher.deleteSubscriber(one);
        publisher.setMsg("Yo");

        System.out.println();

        publisher.deleteSubscriber(two);
        publisher.setMsg("Poo");
    }
}
