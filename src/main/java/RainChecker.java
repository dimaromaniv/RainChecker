import models.*;
import connectors.APIConnector;
import models.weatherdata.WeatherResponse;


import java.net.URISyntaxException;
import java.util.List;

public class RainChecker {


    public static void main(String[] args) throws URISyntaxException {
        APIConnector apiConnector = new APIConnector();
        WeatherResponse weatherResponse = apiConnector.getAPI();
        List<WeatherObject> listOfWeatherObj = weatherResponse.creatingListOfWeatherObjects(weatherResponse);

        System.out.println(listOfWeatherObj.get(38).getMain().getTemp());


//        System.out.println(weatherObjectsList.get(4).getMain().getFeelsLike());
//

//        System.out.println(weatherObject.toStringAllWeatherCondution());
    }

    public static int[] array = new int[]{9, 5, 6, 1};


}



