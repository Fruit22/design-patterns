package factoryMethod;

/**
 * Created by fruit on 16.09.2017.
 */
public class LogiscticsForBus extends Logistics {
    @Override
    public Transport createTransport() {
        return new Bus();
    }
}
