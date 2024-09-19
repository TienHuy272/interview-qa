package hnt.coding.interview.design.behavior.observer.display;

import hnt.coding.interview.design.behavior.observer.WeatherData;

public class Application {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        System.out.println("---------Update Measurement day1---------");
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("\n\n");

        System.out.println("---------Update Measurement day2---------");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("\n\n");

        System.out.println("---------Update Measurement day3---------");
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("\n\n");


        System.out.println("---------REMOVE FORCAST DISPLAY------------");
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
    }
}
