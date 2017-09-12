package decorator;

/**
 * Created by fruit on 13.09.2017.
 */
public class WriterDecoratorTwo implements Writer {
    Writer writer;

    public WriterDecoratorTwo(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void write() {
        System.out.println("I'm decorator 2");
        writer.write();
    }
}
