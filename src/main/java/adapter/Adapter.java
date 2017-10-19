package adapter;

/**
 * Created by fruit on 19.10.2017.
 */
public class Adapter implements CoffeeMachine {

    private UniversalMachine universalMachine;

    public Adapter(UniversalMachine universalMachine) {
        this.universalMachine = universalMachine;
    }

    @Override
    public void makeCoffee() {
        universalMachine.makeHotDrink();
    }
}
