package ObserverPattern.Observer;

import ObserverPattern.Subject.Subject;

/**
 * @projectName: Java_DesignPattern
 * @description: 酷热指数模板
 * @author: 小新
 * @date: 2022-06-09 09:52
 **/
public class HeatIndexDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat index is: "+ temperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure =pressure;
        display();
    }
}
