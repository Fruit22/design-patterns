package adapter;

/**
 * Created by fruit on 19.10.2017.
 */
public class UniversalMachineImpl implements UniversalMachine {

    @Override
    public void makeHotDrink() {
        System.out.println("It's your coffee from universal machine!");
    }

    @Override
    public void makeCoolingDrink() {
        System.out.println("It's your ice-tea from universal machine!");
    }
}
