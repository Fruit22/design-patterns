package abstractFactory;

/**
 * Created by fruit on 17.09.2017.
 */
public interface AbstractFactory {
    Developer createDeveloper();
    Tester createTester();
    Manager createManager();
}
