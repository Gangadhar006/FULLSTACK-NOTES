package design_patterns.behavioural.observer_dp;

import design_patterns.behavioural.observer_dp.observers.CurrentDisplay;
import design_patterns.behavioural.observer_dp.observers.ForecastDisplay;
import design_patterns.behavioural.observer_dp.observers.StatisticsDisplay;
import design_patterns.behavioural.observer_dp.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        CurrentDisplay cd = new CurrentDisplay(data);
        StatisticsDisplay sd = new StatisticsDisplay(data);
        ForecastDisplay fd = new ForecastDisplay(data);

        data.setMeasurements(1, 2, 3);
        data.removeObserver(sd);
        data.setMeasurements(4, 5, 6);

    }
}