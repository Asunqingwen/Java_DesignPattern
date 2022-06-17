package OrderPattern.Command;

/**
 * @projectName: Java_DesignPattern
 * @description: 宏命令
 * @author: 小新
 * @date: 2022-06-16 16:59
 **/
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
