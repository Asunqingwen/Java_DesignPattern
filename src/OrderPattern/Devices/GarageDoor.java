package OrderPattern.Devices;

/**
 * @projectName: Java_DesignPattern
 * @description: 车库门
 * @author: 小新
 * @date: 2022-06-15 17:11
 **/
public class GarageDoor {
    public GarageDoor(String place) {
    }


    public void up() {
        System.out.println("Garage door is Open!");
    }


    public void down() {
        System.out.println("Garage door is Close!");
    }


    public void stop() {
        System.out.println("Garage door is Stop!");
    }


    public void lightOn() {
        System.out.println("Garage door'light is On!");
    }


    public void lightOff() {
        System.out.println("Garage door'light is Off!");
    }


}
