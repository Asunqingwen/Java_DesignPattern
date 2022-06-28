package FacadePattern.Devices;

/**
 * @projectName: Java_DesignPattern
 * @description: 放大器
 * @author: 小新
 * @date: 2022-06-27 16:54
 **/
public class Amplifier {
    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void setDvdPlayer(DVDPlayer dvdPlayer) {
        System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround on (5 speakers,1 subwoofer)");
    }

    public void setVolume(int volume) {
        System.out.println("Top-O-Line Amplifier setting volume to" + volume);
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }
}
