package abstractFactory.Two;

import abstractFactory.AbstractFactory;
import abstractFactory.Developer;
import abstractFactory.Manager;
import abstractFactory.Tester;

/**
 * Created by fruit on 17.09.2017.
 */
public class FactoryTwo implements AbstractFactory {
    @Override
    public Developer createDeveloper() {
        return new DevTwo();
    }

    @Override
    public Tester createTester() {
        return new TesterTwo();
    }

    @Override
    public Manager createManager() {
        return new ManagerTwo();
    }
}
