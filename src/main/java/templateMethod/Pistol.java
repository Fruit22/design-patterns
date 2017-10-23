package templateMethod;

/**
 * Created by fruit on 23.10.2017.
 */
public class Pistol extends ShotsManagement {
    @Override
    public void prepareWeapons() {
        System.out.println("The pistol is ready");
    }

    @Override
    public void loadWeapons() {
        System.out.println("The pistol is loaded");
    }

    @Override
    public void shoot() {
        System.out.println("The pistol has shot");
    }
}
