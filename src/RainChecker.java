import models.*;


import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class RainChecker {


    public static void main(String[] args) throws URISyntaxException {
        APIConnector apiConnector = new APIConnector();
//       WeatherData weatherObject = apiConnector.getAPI();
//        WeatherForecast weatherForecast = apiConnector.getAPI();
//
        WeatherResponse weatherResponse = apiConnector.getAPI();
        System.out.println(weatherResponse);
        List<WeatherObject> weatherObjectsList = new ArrayList<>();
        List<WeatherData> weatherDataList = weatherResponse.list;
        for (WeatherData data : weatherDataList){
            WeatherObject weatherObject = new WeatherObject(data.dt, data.main.temp, data.getWeather());
            weatherObjectsList.add(weatherObject);
        }

        System.out.println(weatherObjectsList.get(0).getTemperature());
        System.out.println(weatherObjectsList.size());
        //System.out.println(weatherForecast.getWeatherForecast().get(0).toStringAllWeatherCondution());
//        for (int i = 0 ; i < weatherForecast.getWeatherForecast().size(); i++) {
//            WeatherObject o = weatherForecast.getWeatherForecast().get(i);;
//            System.out.println(o.toStringAllWeatherCondution());
//
//        }
//        System.out.println(weatherObject.toStringAllWeatherCondution());
    }





}
