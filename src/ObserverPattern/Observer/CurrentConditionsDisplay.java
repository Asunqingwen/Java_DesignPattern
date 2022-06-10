package ObserverPattern.Observer;

import ObserverPattern.Subject.Subject;

/**
 * @projectName: Java_DesignPattern
 * @description: 状况布告板
 * @author: 小新
 * @date: 2022-06-08 16:22
 **/
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature+"F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
