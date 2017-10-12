package command;

/**
 * Created by fruit on 12.10.2017.
 */
public class DeviceOnCommand implements Command {
    private Device device;

    public DeviceOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.deviceOn();
    }
}
