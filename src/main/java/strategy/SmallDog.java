package strategy;

/**
 * Created by fruit on 09.09.2017.
 */
public class SmallDog extends Dog {
    public SmallDog() {
        setBarkBehavior(new BarkOfSmallDog());
    }
}
