package ObserverPattern;

import ObserverPattern.Observer.*;
import ObserverPattern.Subject.NewWeatherData;

/**
 * @projectName: Java_DesignPattern
 * @description: 主函数
 * @author: 小新
 * @date: 2022-06-08 16:31
 **/
public class WeatherStation {
    public static void main(String[] args) {
//        WeatherData weatherData = new WeatherData();
//        CurrentConditionsDisplay currentConditionsDisplay= new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay= new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay= new ForecastDisplay(weatherData);
//        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
//
//        weatherData.setMeasurements(80,65,30.4f);
//        System.out.println("\n");
//        weatherData.setMeasurements(82,70,29.2f);
//        System.out.println("\n");
//        weatherData.setMeasurements(78,90,29.2f);

        NewWeatherData newWeatherData = new NewWeatherData();
        NewCurrentConditionsDisplay newCurrentConditionsDisplay= new NewCurrentConditionsDisplay(newWeatherData);
        NewForecastDisplay newForecastDisplay= new NewForecastDisplay(newWeatherData);

        newWeatherData.setMeasurements(80,65,30.4f);
        System.out.println("\n");
        newWeatherData.setMeasurements(82,70,29.2f);
        System.out.println("\n");
        newWeatherData.setMeasurements(78,90,29.2f);
    }
}
