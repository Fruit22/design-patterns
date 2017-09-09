package strategy;

/**
 * Created by fruit on 09.09.2017.
 */
public class BarkOfSmallDog implements BarkBehavior {
    public void bark() {
        System.out.println("I'm a small dog. Woof.");
    }
}
