package FacadePattern.Devices;

/**
 * @projectName: Java_DesignPattern
 * @description: 投影仪
 * @author: 小新
 * @date: 2022-06-27 16:57
 **/
public class Projector {
    public void on() {
        System.out.println("Top-O-Line Projector on");
    }

    public void off() {
        System.out.println("Top-O-Line Projector off!");
    }

    public void wideScreenMode() {
        System.out.println("Top-O-Line Projector in widescreen mode (16x9 aspect ratio)");
    }
}
