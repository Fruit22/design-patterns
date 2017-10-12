package command;

/**
 * Created by fruit on 12.10.2017.
 */
public class DeviceRestartCommand implements Command {
    private Device device;

    public DeviceRestartCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.deviceRestart();
    }
}
