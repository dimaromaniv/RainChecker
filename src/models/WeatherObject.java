package models;

import java.util.Arrays;

public class WeatherObject {
    private long timestamp;
    private double temperature;
    private String weatherDescription;

    public WeatherObject(long timestamp, double temperature, Weather[] weatherDescription) {
        this.timestamp = timestamp;
        this.temperature = temperature;
        this.weatherDescription = Arrays.toString(weatherDescription);
    }

    // Getters and setters (or public fields) for the class members
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }
}
