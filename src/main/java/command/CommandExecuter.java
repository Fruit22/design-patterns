package command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fruit on 12.10.2017.
 */
public class CommandExecuter {
    List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void run() {
        for (Command command: commands) {
            command.execute();
        }
    }
}
