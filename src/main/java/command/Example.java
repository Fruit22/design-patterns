package command;

/**
 * Created by fruit on 12.10.2017.
 */
public class Example {

    public static void main(String[] args) {
        Device device = new Device();
        CommandExecuter executer = new CommandExecuter();
        Command commandOn = new DeviceOnCommand(device);
        Command commandOff = new DeviceOffCommand(device);
        Command commandRestart = new DeviceRestartCommand(device);
        executer.addCommand(commandOn);
        executer.addCommand(commandOff);
        executer.addCommand(commandRestart);
        executer.run();
    }
}
