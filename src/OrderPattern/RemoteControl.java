package OrderPattern;

import OrderPattern.Command.Command;
import OrderPattern.Command.NoCommand;

/**
 * @projectName: Java_DesignPattern
 * @description: 遥控器
 * @author: 小新
 * @date: 2022-06-16 09:51
 **/
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("    ").append(offCommands[i].getClass().getName()).append("\n");
        }
        stringBuffer.append("[undo] ").append(undoCommand.getClass().getName()).append("\n");
        return stringBuffer.toString();
    }
}
