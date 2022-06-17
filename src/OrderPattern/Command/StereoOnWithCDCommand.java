package OrderPattern.Command;

import OrderPattern.Devices.Stereo;

/**
 * @projectName: Java_DesignPattern
 * @description: 音响放cd命令
 * @author: 小新
 * @date: 2022-06-16 13:19
 **/
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
