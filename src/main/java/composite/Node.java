package composite;

import java.util.ArrayList;

/**
 * Created by fruit on 08.11.2017.
 */
public class Node implements Element {
    private ArrayList<Element> elements = new ArrayList<>();
    private String name;

    public Node(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Node name: " + name);
        System.out.println("My elements: ");
        for (Element e : elements) {
            e.print();
        }
        System.out.println();
    }

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }
}
