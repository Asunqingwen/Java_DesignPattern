package OrderPattern.Command;

import OrderPattern.Devices.GarageDoor;

/**
 * @projectName: Java_DesignPattern
 * @description: 开车库门命令
 * @author: 小新
 * @date: 2022-06-15 17:13
 **/
public class GarageDoorUpCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorUpCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
