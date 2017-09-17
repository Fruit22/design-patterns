package abstractFactory.one;

import abstractFactory.Developer;

/**
 * Created by fruit on 17.09.2017.
 */
public class DevOne implements Developer {
    @Override
    public void develop() {
        System.out.println("Dev One");
    }
}
