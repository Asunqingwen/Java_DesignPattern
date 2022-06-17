package OrderPattern.Command;

/**
 * @projectName: Java_DesignPattern
 * @description: 无指令
 * @author: 小新
 * @date: 2022-06-16 10:34
 **/
public class NoCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
