package abstractFactory.one;

import abstractFactory.AbstractFactory;
import abstractFactory.Developer;
import abstractFactory.Manager;
import abstractFactory.Tester;

/**
 * Created by fruit on 17.09.2017.
 */
public class FactoryOne implements AbstractFactory {
    @Override
    public Developer createDeveloper() {
        return new DevOne();
    }

    @Override
    public Tester createTester() {
        return new TesterOne();
    }

    @Override
    public Manager createManager() {
        return new ManagerOne();
    }
}
