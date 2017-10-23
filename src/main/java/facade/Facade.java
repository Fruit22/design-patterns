package facade;

import java.io.FileOutputStream;

/**
 * Created by fruit on 23.10.2017.
 */
public class Facade {
    private BottleMakingMachine bottleMakingMachine = new BottleMakingMachine();
    private FillingMachine fillingMachine = new FillingMachine();
    private LabelingMachine labelingMachine = new LabelingMachine();

    public void createDrink() {
        bottleMakingMachine.makeBottle();
        fillingMachine.fillBottle();
        labelingMachine.maleLabels();
    }
}
