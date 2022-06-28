package FacadePattern.Devices;

/**
 * @projectName: Java_DesignPattern
 * @description: DVD播放器
 * @author: 小新
 * @date: 2022-06-27 16:54
 **/
public class DVDPlayer {
    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void play(String movie) {
        System.out.println("Top-O-Line DVD Player playing" + movie);
    }

    public void stop(String movie) {
        System.out.println("Top-O-Line DVD Player stopped" + movie);
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }
}
