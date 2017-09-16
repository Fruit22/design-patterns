package factoryMethod;

/**
 * Created by fruit on 16.09.2017.
 */
public class Example {

    public static void main(String[] args) {
        Logistics logistics = new LogiscticsForBus();
        logistics.go();
        logistics = new LogisticsForCar();
        logistics.go();
    }
}
