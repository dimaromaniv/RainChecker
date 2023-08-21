package models;

import com.google.gson.annotations.SerializedName;

public class WeatherObject {
    private Coordinate coord;
    private Weather[] weather;
    private Main main;
    private Wind wind;
    private Clouds clouds;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;

    @SerializedName("base")
    private String dataBase;

    @SerializedName("dt")
    private long dateTime;

    private int visibility;

    public WeatherObject () {}

    public WeatherObject (WeatherObject weatherObjectInput) {}

    public WeatherObject (Main main, Coordinate coord, Weather[] weather, Wind wind, Clouds clouds,
                           Sys sys, int timezone, int id, String name, int cod,
                          String dataBase, long dateTime, int visibility) {
        this.main = main;
        this.coord = coord;
        this.weather = weather;
        this.wind = wind;
        this.clouds = clouds;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
        this.dataBase = dataBase;
        this.dateTime = dateTime;
        this.visibility = visibility;
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

    public int getTimezone() {
        return timezone;
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
        return dateTime;
    }

    public int getVisibility() {
        return visibility;
    }

    public String toStringAllWeatherCondution() {
        StringBuilder sb = new StringBuilder();

        sb.append("City: ").append(name).append("\n");
        sb.append("Coordinates: ").append(coord.getLat()).append(", ").append(coord.getLon()).append("\n");

        sb.append("Weather: ");
        for (Weather w : weather) {
            sb.append(w.getDescription()).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()); // Remove the last ", "
        sb.append("\n");

        sb.append("Temperature: ").append(main.getTemp()).append(" °C").append("\n");
        sb.append("Feels Like: ").append(main.getFeelsLike()).append(" °C").append("\n");
        sb.append("Pressure: ").append(main.getPressure()).append(" hPa").append("\n");
        sb.append("Humidity: ").append(main.getHumidity()).append("%").append("\n");

        sb.append("Wind: ").append(wind.getSpeed()).append(" m/s").append("\n");

        sb.append("Cloudiness: ").append(clouds.getAll()).append("%").append("\n");

        sb.append("Sunrise: ").append(sys.getSunrise()).append("\n");
        sb.append("Sunset: ").append(sys.getSunset()).append("\n");

        sb.append("Timezone: ").append(timezone).append("\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Cod: ").append(cod).append("\n");

        sb.append("Base: ").append(dataBase).append("\n");
        sb.append("Date and Time: ").append(dateTime).append("\n");
        sb.append("Visibility: ").append(visibility).append(" meters").append("\n");

        return sb.toString();
    }

}
