package weatherdata;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import models.weather.*;
import models.weather.City;
import models.weather.Clouds;
import models.weather.Coordinate;
import models.weather.Main;
import models.weather.Sys;
import models.weather.Weather;
import models.weather.Wind;
@Entity
public class WeatherData {
    public long dt;
    private Coordinate coord;
    private Weather[] weather;
    public Main main;
    private Wind wind;
    private Clouds clouds;
    private Sys sys;
    private City city ;
    private int id;
    private String name;
    private int cod;

    @SerializedName("base")
    private String dataBase;

//    @SerializedName("dt")
//    private long dateTime;

    private int visibility;

    public WeatherData() {
    }

//    public WeatherData(WeatherObject weatherObjectInput) {
//    }

    public WeatherData(Main main, Weather[] weather, Wind wind, Clouds clouds, Coordinate coord,
                       Sys sys, City cityInfo, int id, String name, int cod,
                       String dataBase, long dt, int visibility) {
        this.main = main;
        this.coord = coord;
        this.weather = weather;
        this.wind = wind;
        this.clouds = clouds;
        this.sys = sys;
        this.city = city ;
        this.id = id;
        this.name = name;
        this.cod = cod;
        this.dataBase = dataBase;
       // this.dateTime = dateTime;
        this.visibility = visibility;
        this.dt = dt;
    }

    public Coordinate getCoord() {
        return coord;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public Main getMain() {
        return main;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Sys getSys() {
        return sys;
    }

    public City getCity() {
        return city ;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }

    public String getBase() {
        return dataBase;
    }

    public long getDateTime() {
        return dt;
    }

    public int getVisibility() {
        return visibility;
    }

//    public String toStringAllWeatherCondution() {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("City: ").append(name).append("\n");
//
//        if (coord != null) {
//            sb.append("Coordinates: ").append(coord.getLat()).append(", ").append(coord.getLon()).append("\n");
//        } else {
//            sb.append("Coordinates: N/A\n"); // Handle null coord
//        }
//
//        sb.append("Weather: ");
//        for (Weather w : weather) {
//            sb.append(w.getDescription()).append(", ");
//        }
//        sb.delete(sb.length() - 2, sb.length()); // Remove the last ", "
//        sb.append("\n");
//
//        sb.append("Temperature: ").append(main.getTemp()).append(" °C").append("\n");
//        sb.append("Feels Like: ").append(main.getFeelsLike()).append(" °C").append("\n");
//        sb.append("Pressure: ").append(main.getPressure()).append(" hPa").append("\n");
//        sb.append("Humidity: ").append(main.getHumidity()).append("%").append("\n");
//
//        sb.append("Wind: ").append(wind.getSpeed()).append(" m/s").append("\n");
//
//        sb.append("Cloudiness: ").append(clouds.getCloudsPersent()).append("%").append("\n");
//
//        sb.append("Sunrise: ").append(sys.getSunrise()).append("\n");
//        sb.append("Sunset: ").append(sys.getSunset()).append("\n");
//
//
//        sb.append("ID: ").append(id).append("\n");
//        sb.append("Cod: ").append(cod).append("\n");
//
//        sb.append("Base: ").append(dataBase).append("\n");
//        sb.append("Date and Time: ").append(dt).append("\n");
//        sb.append("Visibility: ").append(visibility).append(" meters").append("\n");
//
//        return sb.toString();
//    }


}
