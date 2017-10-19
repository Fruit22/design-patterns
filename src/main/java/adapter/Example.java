package adapter;

/**
 * Created by fruit on 19.10.2017.
 */
public class Example {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachineImpl();
        coffeeMachine.makeCoffee();

        coffeeMachine = new Adapter(new UniversalMachineImpl());
        coffeeMachine.makeCoffee();
    }
}
