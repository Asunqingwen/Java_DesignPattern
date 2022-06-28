package FacadePattern;

import FacadePattern.Devices.*;
import FacadePattern.Facade.HomeTheaterFacade;

/**
 * @projectName: Java_DesignPattern
 * @description: 主函数
 * @author: 小新
 * @date: 2022-06-28 13:32
 **/
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DVDPlayer dvdPlayer = new DVDPlayer();
        CDPlayer cdPlayer = new CDPlayer();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer,
                projector, screen, theaterLights, popcornPopper);

        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie("Raiders of the Lost Ark");
    }
}
