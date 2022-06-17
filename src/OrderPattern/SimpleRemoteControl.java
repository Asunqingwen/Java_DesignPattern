package OrderPattern;

import OrderPattern.Command.Command;

/**
 * @projectName: Java_DesignPattern
 * @description: 遥控器
 * @author: 小新
 * @date: 2022-06-15 16:48
 **/
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){};

    public void setCommand(Command command) {
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
