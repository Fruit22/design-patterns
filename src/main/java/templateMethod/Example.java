package templateMethod;

/**
 * Created by fruit on 23.10.2017.
 */
public class Example {
    public static void main(String[] args) {
        ShotsManagement shotsManagement = new Pistol();
        shotsManagement.makeShot();

        shotsManagement = new Bow();
        shotsManagement.makeShot();
    }
}
