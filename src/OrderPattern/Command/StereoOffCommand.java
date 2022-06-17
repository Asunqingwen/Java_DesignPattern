package OrderPattern.Command;

import OrderPattern.Devices.Stereo;

/**
 * @projectName: Java_DesignPattern
 * @description: 关音响命令
 * @author: 小新
 * @date: 2022-06-16 16:10
 **/
public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
