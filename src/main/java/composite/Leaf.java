package composite;

/**
 * Created by fruit on 08.11.2017.
 */
public class Leaf implements Element {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("My name is " + name);
    }
}
