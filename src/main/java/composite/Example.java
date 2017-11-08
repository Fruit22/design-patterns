package composite;

/**
 * Created by fruit on 08.11.2017.
 */
public class Example {
    public static void main(String[] args) {
        Node nodeOne = new Node("NodeOne");
        Node nodeTwo = new Node("NodeTwo");
        Element leafOne = new Leaf("LeafOne");
        Element leafTwo = new Leaf("LeafTwo");
        Element leafThree = new Leaf("LeafThree");

        nodeOne.add(leafOne);
        nodeTwo.add(leafTwo);
        nodeTwo.add(leafThree);
        nodeOne.add(nodeTwo);

        nodeOne.print();
    }
}
