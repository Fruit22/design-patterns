package singleton;

/**
 * Created by fruit on 17.09.2017.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
            return singleton;
        }

        return singleton;
    }
}
