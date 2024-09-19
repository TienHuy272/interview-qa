package hnt.coding.interview.design.behavior.observer.display;

import hnt.coding.interview.design.behavior.observer.Observer;
import hnt.coding.interview.design.behavior.observer.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay: " + this.temperature + " - Humidity: " + this.humidity);
    }
}
