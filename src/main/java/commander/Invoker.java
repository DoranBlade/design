package commander;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> commandList;

    public Invoker() {
        commandList = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void cancel(Command command) {
        commandList.remove(command);
    }

    public void Notify() {
        commandList.forEach(Command::exec);
    }

}
