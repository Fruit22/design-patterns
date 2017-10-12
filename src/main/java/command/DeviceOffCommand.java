package command;

/**
 * Created by fruit on 12.10.2017.
 */
public class DeviceOffCommand implements Command {
    private Device device;

    public DeviceOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.deviceOff();
    }
}
