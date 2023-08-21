package models;

import com.google.gson.annotations.SerializedName;

public class WeatherObject {
    private Coordinate coordinate;
    private Weather[] weather;
    private Main main;

    private Clouds clouds;
    private SunRiseAndSunSet sys;

    @SerializedName("base")
    private String dataBase;

    @SerializedName("dt")
    private long dateTime;

    private int visibility;
    private int timezone;
    private int id;
    private String name;
    private int cod;
    public WeatherObject () {}

    public WeatherObject (WeatherObject weatherObjectInput) {}

    public WeatherObject (Main main,Coordinate coordinate,Clouds clouds){
        this.main = main;
        this.coordinate = coordinate;
        this.clouds = clouds;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public static WeatherObject createObject (WeatherObject weatherObjectInput) {
        WeatherObject weatherObject = new WeatherObject(weatherObjectInput);
//        weatherObject.getMain().toString();
//        weatherObject.getMain();
//        weatherObject.getClouds();
//        weatherObject.getCoordinate();


        return weatherObject;
    }
}
