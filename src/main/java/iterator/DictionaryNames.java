package iterator;

/**
 * Created by fruit on 08.11.2017.
 */
public class DictionaryNames implements IteratorCreator {
    public String names[] = {"Mike", "Max", "Jex", "Sergio"};

    public String[] getNames() {
        return names;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
