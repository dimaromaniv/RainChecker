package models.weather;

public class Coordinate {
    private double lon;
    private double lat;

    public Coordinate() {
        this.lon = 0.0;
        this.lat = 0.0;

    }

    public Coordinate(Double lon, Double lat) {
        this.lon = lon;
        this.lat = lat;
    }
    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }


}
