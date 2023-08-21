import models.APIConnector;
import models.WeatherObject;

import java.net.URISyntaxException;

public class RainChecker {


    public static void main(String[] args) throws URISyntaxException {
        APIConnector apiConnector = new APIConnector();
        WeatherObject weatherObject = apiConnector.getAPI();
        System.out.println(weatherObject.toStringAllWeatherCondution());
    }





}
