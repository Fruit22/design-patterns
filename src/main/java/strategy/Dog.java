package strategy;

/**
 * Created by fruit on 09.09.2017.
 */
public abstract class Dog {
    private BarkBehavior barkBehavior;

    public void bark() {
        barkBehavior.bark();
    }

    public void eat() {
        System.out.println("I have eaten");
    }

    public void setBarkBehavior(BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }
}
