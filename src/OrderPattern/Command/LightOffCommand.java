package OrderPattern.Command;

import OrderPattern.Devices.Light;

/**
 * @projectName: Java_DesignPattern
 * @description: 关电灯命令
 * @author: 小新
 * @date: 2022-06-16 11:23
 **/
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
