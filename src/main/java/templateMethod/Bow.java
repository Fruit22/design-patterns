package templateMethod;

/**
 * Created by fruit on 23.10.2017.
 */
public class Bow extends ShotsManagement {
    @Override
    public void prepareWeapons() {
        System.out.println("Arrows are ready");
    }

    @Override
    public void loadWeapons() {
        System.out.println("The arrow is inserted");
    }

    @Override
    public void shoot() {
        System.out.println("Arrow in air");
    }
}
