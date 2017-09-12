package decorator;

/**
 * Created by fruit on 13.09.2017.
 */
public class WriterDecoratorOne implements Writer{
    Writer writer;

    public WriterDecoratorOne(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void write() {
        System.out.println("I'm decorator 1");
        writer.write();
    }
}
