package decorator;

/**
 * Created by fruit on 13.09.2017.
 */
public class WriterImpl implements Writer {
    @Override
    public void write() {
        System.out.println("Hello, my friend!");
    }
}
