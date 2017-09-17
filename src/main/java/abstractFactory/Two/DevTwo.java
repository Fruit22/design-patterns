package abstractFactory.Two;

import abstractFactory.Developer;

/**
 * Created by fruit on 17.09.2017.
 */
public class DevTwo implements Developer {
    @Override
    public void develop() {
        System.out.println("Dev Two");
    }
}
