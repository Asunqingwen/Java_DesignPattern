package FacadePattern.Facade;

import FacadePattern.Devices.*;

/**
 * @projectName: Java_DesignPattern
 * @description: 家庭影院外观
 * @author: 小新
 * @date: 2022-06-27 16:58
 **/
public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DVDPlayer dvdPlayer;
    CDPlayer cdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             DVDPlayer dvdPlayer,
                             CDPlayer cdPlayer,
                             Projector projector,
                             Screen screen,
                             TheaterLights theaterLights,
                             PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvdPlayer(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(String movie) {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop(movie);
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
