import models.*;
import connectors.APIConnector;
import models.weatherdata.WeatherResponse;


import java.net.URISyntaxException;
import java.util.List;

public class RainChecker {


    public static void main(String[] args) throws URISyntaxException {
        run();


//        APIConnector apiConnector = new APIConnector();
//        WeatherResponse weatherResponse = apiConnector.getAPI();
//        List<WeatherObject> listOfWeatherObj = weatherResponse.creatingListOfWeatherObjects(weatherResponse);
//
//        System.out.println(listOfWeatherObj.get(38).getMain().getTemp());


//        System.out.println(weatherObjectsList.get(4).getMain().getFeelsLike());
//

//        System.out.println(weatherObject.toStringAllWeatherCondution());
    }

    public static void run(){
        APIConnector apiConnector = new APIConnector();
        WeatherResponse weatherResponse = apiConnector.getAPI();
        List<WeatherObject> listOfWeatherObj = weatherResponse.creatingListOfWeatherObjects(weatherResponse);
        Calculation calculation = new Calculation(weatherResponse);

        calculation.cloudyPercent();
        calculation.cloudyDescryption();
        calculation.weatherIdCounter();
        calculation.humidityPercent();
        calculation.temperatureLevel();
        calculation.forecastTimeLap();
        calculation.makeWateringDecision();


        System.out.println(calculation.cloudyPercent());

    }

}



