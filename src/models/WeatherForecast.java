package models;

import java.util.ArrayList;
import java.util.List;

public class WeatherForecast {
    private List<WeatherData> weather = new ArrayList<>() ; // Change the field name to "weather"

    public WeatherForecast() {}
    public WeatherForecast(List<WeatherData> weather) {
        this.weather = weather;
    }

    public List<WeatherData> getWeatherForecast() { // Adjust the getter method
        return weather;
    }
    public Integer getSize(){
        return weather.size();
    }
}
