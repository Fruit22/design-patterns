package factoryMethod;

/**
 * Created by fruit on 16.09.2017.
 */
public class Bus implements Transport {
    @Override
    public void beep() {
        System.out.println("I'm a bus. Beeeeep!");
    }

    @Override
    public void ride() {
        System.out.println("I'm a bus. Go!");
    }
}
