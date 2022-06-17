package OrderPattern.Command;

import OrderPattern.Devices.Light;

/**
 * @projectName: Java_DesignPattern
 * @description: 开电灯命令
 * @author: 小新
 * @date: 2022-06-15 16:42
 **/
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
