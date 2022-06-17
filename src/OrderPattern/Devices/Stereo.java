package OrderPattern.Devices;

/**
 * @projectName: Java_DesignPattern
 * @description: 音响
 * @author: 小新
 * @date: 2022-06-16 13:14
 **/
public class Stereo {
    String place;

    public Stereo(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println(this.place + "'s Stereo is On!");
    }

    public void off() {
        System.out.println(this.place + "'s Stereo is Off!");
    }

    public void setCD() {
        System.out.println(this.place + "'s Stereo has set CD!");
    }

    public void setDVD() {
        System.out.println(this.place + "'s Stereo has set DVD!");
    }

    public void setRadio() {
        System.out.println(this.place + "'s Stereo has set radio!");
    }

    public void setVolume(int volume) {
        System.out.println(this.place + "'s Stereo's volume is " + volume);
    }
}
