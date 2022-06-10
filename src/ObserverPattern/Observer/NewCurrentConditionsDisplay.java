package ObserverPattern.Observer;

import ObserverPattern.Subject.NewWeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @projectName: Java_DesignPattern
 * @description: 实现内置接口
 * @author: 小新
 * @date: 2022-06-09 10:52
 **/
public class NewCurrentConditionsDisplay implements Observer,DisplayElement{
    Observable observable;
    private float temperature;
    private float humidity;

    public NewCurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature+"F degrees and " + humidity + "% humidity");
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof NewWeatherData){
            NewWeatherData newWeatherData = (NewWeatherData)o;
            this.temperature = newWeatherData.getTemperature();
            this.humidity = newWeatherData.getHumidity();
            display();
        }
    }
}
