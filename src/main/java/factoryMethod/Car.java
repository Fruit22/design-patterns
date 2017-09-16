package factoryMethod;

/**
 * Created by fruit on 16.09.2017.
 */
public class Car implements Transport {
    @Override
    public void beep() {
        System.out.println("I'm a car. Beeeeeep!");
    }

    @Override
    public void ride() {
        System.out.println("I'm a car. Go!");
    }
}
