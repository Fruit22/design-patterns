package templateMethod;

/**
 * Created by fruit on 23.10.2017.
 */
public abstract class ShotsManagement {
    public abstract void prepareWeapons();
    public abstract void loadWeapons();
    public abstract void shoot();

    public void makeShot() {
        prepareWeapons();
        loadWeapons();
        shoot();
    }
}
