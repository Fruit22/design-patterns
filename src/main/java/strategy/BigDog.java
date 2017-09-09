package strategy;

/**
 * Created by fruit on 09.09.2017.
 */
public class BigDog extends Dog {
    public BigDog() {
        setBarkBehavior(new BarkOfBigDog());
    }
}
