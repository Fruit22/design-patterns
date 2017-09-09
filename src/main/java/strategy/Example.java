package strategy;

/**
 * Created by fruit on 09.09.2017.
 */
public class Example {
    public static void main(String[] args) {
        Dog dog = new BigDog();
        dog.bark();
        dog.eat();

        dog = new SmallDog();
        dog.bark();
        dog.eat();

        dog.setBarkBehavior(new BarkOfBigDog());
        dog.bark();
    }
}
