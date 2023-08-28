package weatherdata;

import java.util.ArrayList;
import java.util.List;

public class WeatherResponse {
    public String cod;
    public String message;
    public int cnt;
    public List<WeatherData> list;


    public  List<WeatherObject> creatingListOfWeatherObjects(WeatherResponse weatherResponse){

        List<WeatherObject> weatherObjectsList = new ArrayList<>();
        List<WeatherData> weatherDataList = weatherResponse.list;
        for (WeatherData data : weatherDataList){
            WeatherObject weatherObject = new WeatherObject(data.dt, data.getMain(), data.getSys(),data.getWind(),
                    data.getClouds(), data.getCoord(), data.getCity(), data.getWeather());
            weatherObjectsList.add(weatherObject);
        }
        return weatherObjectsList;
    }

}