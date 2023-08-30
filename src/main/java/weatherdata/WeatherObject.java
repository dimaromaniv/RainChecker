package weatherdata;



import jakarta.persistence.Entity;
import models.weather.City;
import models.weather.Clouds;
import models.weather.Coordinate;
import models.weather.Sys;
import models.weather.Weather;
import models.weather.Wind;
import models.weather.Main;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
@Entity
public class WeatherObject {
    private long timestamp;
    private Clouds clouds;
    private Coordinate coordinate;
    private City city;
    private Main main;
    private Sys sys;
    private Wind wind;
    private Weather[] weather;


    public WeatherObject(long timestamp, Main main, Sys sys, Wind wind, Clouds clouds, Coordinate coordinate, City city, Weather[] weather) {
        this.timestamp = timestamp;

        //this.weatherDescription = Arrays.toString(weatherDescription);
        this.clouds = clouds;
        this.coordinate = coordinate;
        this.city = city;
        this.main = main;
        this.sys = sys;
        this.wind = wind;
        this.weather = weather;
    }




    public Sys getSys() {
        return sys;
    }

    public Wind getWind(){
        return wind;
    }

    public Main getMain() {
        return main;
    }

    public City getCityInfo() {
        return city;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    // Getters and setters (or public fields) for the class members
    public LocalDateTime getTimestamp() {
        Instant instant = Instant.ofEpochSecond(timestamp);
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

    public Weather[] getWeather() {
        return weather;
    }

    public Clouds getClouds() {
        return clouds;
    }


}
