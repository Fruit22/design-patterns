package abstractFactory;

import abstractFactory.Two.FactoryTwo;
import abstractFactory.one.FactoryOne;

/**
 * Created by fruit on 17.09.2017.
 */
public class Example {
    public static void main(String[] args) {
        AbstractFactory factory = new FactoryOne();
        factory.createDeveloper().develop();
        factory.createTester().test();
        factory.createManager().manage();

        factory = new FactoryTwo();
        factory.createDeveloper().develop();
        factory.createTester().test();
        factory.createManager().manage();
    }
}
