package OrderPattern.Devices;

/**
 * @projectName: Java_DesignPattern
 * @description: 吊扇
 * @author: 小新
 * @date: 2022-06-16 13:40
 **/
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    String place;
    int speed;

    public CeilingFan(String place) {
        this.place = place;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public void off() {
        speed = OFF;
    }

    public int getSpeed(){
        return speed;
    }
}
