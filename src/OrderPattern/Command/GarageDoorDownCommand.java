package OrderPattern.Command;

import OrderPattern.Devices.GarageDoor;

/**
 * @projectName: Java_DesignPattern
 * @description: 关车库门命令
 * @author: 小新
 * @date: 2022-06-16 16:09
 **/
public class GarageDoorDownCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorDownCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
