import models.APIConnector;
import models.WeatherForecast;
import models.WeatherObject;

import java.net.URISyntaxException;

public class RainChecker {


    public static void main(String[] args) throws URISyntaxException {
        APIConnector apiConnector = new APIConnector();
//       WeatherObject weatherObject = apiConnector.getAPI();
        WeatherForecast weatherForecast = apiConnector.getAPI();

        System.out.println(weatherForecast.getSize());
        //System.out.println(weatherForecast.getWeatherForecast().get(0).toStringAllWeatherCondution());
//        for (int i = 0 ; i < weatherForecast.getWeatherForecast().size(); i++) {
//            WeatherObject o = weatherForecast.getWeatherForecast().get(i);;
//            System.out.println(o.toStringAllWeatherCondution());
//
//        }
//        System.out.println(weatherObject.toStringAllWeatherCondution());
    }





}
