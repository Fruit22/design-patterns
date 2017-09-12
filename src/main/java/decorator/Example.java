package decorator;

/**
 * Created by fruit on 13.09.2017.
 */
public class Example {
    public static void main(String[] args) {
        Writer writer = new WriterImpl();
        writer = new WriterDecoratorOne(writer);
        writer = new WriterDecoratorTwo(writer);
        writer.write();
    }
}
