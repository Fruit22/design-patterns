package iterator;

/**
 * Created by fruit on 08.11.2017.
 */
public class ConcreteIterator implements Iterator {
    private DictionaryNames dictionaryNames;
    private int counter = 0;

    public ConcreteIterator(DictionaryNames dictionaryNames) {
        this.dictionaryNames = dictionaryNames;
    }

    @Override
    public boolean hasNext() {
      return counter != dictionaryNames.getNames().length;
    }

    @Override
    public Object next() {
        return dictionaryNames.getNames()[counter++];
    }
}
