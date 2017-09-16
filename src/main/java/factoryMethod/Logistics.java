package factoryMethod;

/**
 * Created by fruit on 16.09.2017.
 */
public abstract class Logistics {
    Transport transport;

    abstract public Transport createTransport();

    public void go() {
        transport = createTransport();
        transport.ride();
        transport.beep();
    }
}
