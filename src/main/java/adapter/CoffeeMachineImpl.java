package adapter;

/**
 * Created by fruit on 19.10.2017.
 */
public class CoffeeMachineImpl implements CoffeeMachine {
    @Override
    public void makeCoffee() {
        System.out.println("It's your coffee, sir, from coffee machine");
    }
}
