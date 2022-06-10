package ObserverPattern.Subject;

import java.util.Observable;

/**
 * @projectName: Java_DesignPattern
 * @description: 继承内置类
 * @author: 小新
 * @date: 2022-06-09 10:48
 **/
public class NewWeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public NewWeatherData(){}

    public  void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }
}
