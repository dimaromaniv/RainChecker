package models;

import java.util.List;

public class WeatherResponse {
    public String cod;
    public String message;
    public int cnt;
    public List<WeatherData> list;
}