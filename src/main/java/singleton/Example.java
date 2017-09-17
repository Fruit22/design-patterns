package singleton;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by fruit on 17.09.2017.
 */
public class Example {
    public static void main(String[] args) {
        NotSingleton one = new NotSingleton();
        NotSingleton two = new NotSingleton();

        System.out.println("Not singleton:");
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());

        Singleton oneS = Singleton.getInstance();
        Singleton twoS = Singleton.getInstance();

        System.out.println("Singleton:");
        System.out.println(oneS.hashCode());
        System.out.println(twoS.hashCode());
    }
}
