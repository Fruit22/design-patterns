package factoryMethod;

/**
 * Created by fruit on 16.09.2017.
 */
public class LogisticsForCar extends Logistics {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
