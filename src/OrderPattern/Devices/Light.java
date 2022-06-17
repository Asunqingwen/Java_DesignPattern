package OrderPattern.Devices;

/**
 * @projectName: Java_DesignPattern
 * @description: 电灯
 * @author: 小新
 * @date: 2022-06-15 16:43
 **/
public class Light {
    String place;

    public Light(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println(this.place + "'s light is On!");
    }

    public void off() {
        System.out.println(this.place + "'s light is Off!");
    }
}