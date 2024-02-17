package design_patterns.behavioural.observer_dp.observers;

import design_patterns.behavioural.observer_dp.subject.Subject;

public class CurrentDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(" current conditions,\ntemp: " + temp + " humidity: " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
