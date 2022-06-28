package FacadePattern.Devices;

/**
 * @projectName: Java_DesignPattern
 * @description: 剧院灯
 * @author: 小新
 * @date: 2022-06-27 16:56
 **/
public class TheaterLights {
    public void dim(int dim) {
        System.out.println("Theater Ceiling Lights dimming to " + dim + "%");
    }

    public void on() {
        System.out.println("Theater Ceiling Lights on!");
    }
}
