package OrderPattern.Command;

/**
 * @projectName: Java_DesignPattern
 * @description: 命令对象接口
 * @author: 小新
 * @date: 2022-06-15 16:41
 **/
public interface Command {
    public void execute();
    public void undo();
}
