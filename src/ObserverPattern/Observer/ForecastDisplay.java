package ObserverPattern.Observer;

import ObserverPattern.Subject.Subject;

/**
 * @projectName: Java_DesignPattern
 * @description: 预测布告板
 * @author: 小新
 * @date: 2022-06-08 16:41
 **/
public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast Data: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + "Pa");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
