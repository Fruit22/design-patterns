package iterator;

import java.util.ArrayList;

/**
 * Created by fruit on 08.11.2017.
 */
public class Example {
    public static void main(String[] args) {
        DictionaryNames dictionaryNames = new DictionaryNames();
        Iterator iterator = dictionaryNames.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
