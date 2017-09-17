package abstractFactory.Two;

import abstractFactory.Manager;

/**
 * Created by fruit on 17.09.2017.
 */
public class ManagerTwo implements Manager {
    @Override
    public void manage() {
        System.out.println("Manager Two");
    }
}
