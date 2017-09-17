package abstractFactory.one;

import abstractFactory.Manager;

/**
 * Created by fruit on 17.09.2017.
 */
public class ManagerOne implements Manager {
    @Override
    public void manage() {
        System.out.println("Manager One");
    }
}
