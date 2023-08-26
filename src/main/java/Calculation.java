import models.WeatherObject;
import models.weather.Weather;
import models.weatherdata.WeatherResponse;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class Calculation {


    private WeatherResponse weatherResponse;

    public Calculation(WeatherResponse weatherResponse) {
        this.weatherResponse = weatherResponse;

    }

    public void makeWateringDecision(){
        double cloudyPercent = cloudyPercent();
        double temperatureLevel = temperatureLevel();
        double humidityPercent = humidityPercent();
        double forecastTimeLap = forecastTimeLap();
        HashMap<String, Integer> weatherIdCounter = weatherIdCounter();
        int counterRain = 0 ;

        for (int i = 0 ; i < weatherIdCounter.size();i++){
        if ( weatherIdCounter.containsKey("Rain")){
            counterRain++;
        }}

        if (temperatureLevel > 25.0 ) {
            System.out.println("It's too hot, consider watering to prevent dehydration.");
        } else if (cloudyPercent >= 40.0 && humidityPercent >= 62.0 && counterRain >= 4 ) {
            System.out.println("High humidity and cloud cover, no need to water.");
        } else if (cloudyPercent < 20.0 && temperatureLevel < 20.0 && humidityPercent < 40.0) {
            System.out.println("Low humidity, low temperature, and clear skies. Water the plants.");
        } else {
            System.out.println("No specific conditions met, regular watering may be needed.");
        }
    }

    public Double cloudyPercent() {
        List<WeatherObject> newList = weatherResponse.creatingListOfWeatherObjects(weatherResponse);
        int totalPercentOfRain = 0;
        int forecastFor6Speps = 6;
        for (int i = 0; i < newList.size() - 34; i++) {
            totalPercentOfRain = totalPercentOfRain + newList.get(i).getClouds().getCloudsPersent();
        }
        double percentOfRainInNext18Hours = totalPercentOfRain / forecastFor6Speps;
        System.out.println("CloudyPercent: " + percentOfRainInNext18Hours);
        return percentOfRainInNext18Hours;

    }

    public Double temperatureLevel() {
        List<WeatherObject> newList = weatherResponse.creatingListOfWeatherObjects(weatherResponse);
        int totalTemperature = 0;
        int forecastFor6Speps = 6;
        for (int i = 0; i < newList.size() - 34; i++) {
            totalTemperature = (int) (totalTemperature + newList.get(i).getMain().getTemp());
        }
        double midlleValueOFTemperatureNext18Hours = totalTemperature / forecastFor6Speps;
        System.out.println("TempLevel: " + midlleValueOFTemperatureNext18Hours);
        return midlleValueOFTemperatureNext18Hours;
    }

    public Double maxTemperatureLevel() {
        List<WeatherObject> newList = weatherResponse.creatingListOfWeatherObjects(weatherResponse);
        int totalTemperature = 0;
        int forecastFor6Speps = 6;
        for (int i = 0; i < newList.size() - 34; i++) {
            totalTemperature = (int) (totalTemperature + newList.get(i).getMain().getTempMax());
        }
        double midlleValueOFMaxTemperatureNext18Hours = totalTemperature / forecastFor6Speps;
        System.out.println("MaxTempLevel: " + midlleValueOFMaxTemperatureNext18Hours);
        return midlleValueOFMaxTemperatureNext18Hours;
    }


    public Double humidityPercent() {
        List<WeatherObject> newList = weatherResponse.creatingListOfWeatherObjects(weatherResponse);
        int totalPercentOfHumidity = 0;
        int forecastFor6Speps = 6;
        for (int i = 0; i < newList.size() - 34; i++) {
            totalPercentOfHumidity = totalPercentOfHumidity + newList.get(i).getMain().getHumidity();
        }
        double percentOfHumidityInNext18Hours = totalPercentOfHumidity / forecastFor6Speps;
        System.out.println("Humidity: "+ percentOfHumidityInNext18Hours);
        return percentOfHumidityInNext18Hours;
    }

    public HashMap<String, Integer> cloudyDescryption() {
        List<WeatherObject> newList = weatherResponse.creatingListOfWeatherObjects(weatherResponse);
        ArrayList<String> weatherArray = new ArrayList<>();

        for (int i = 0; i < newList.size() - 34; i++) {
            weatherArray.add(newList.get(i).getWeather()[0].getDescription());
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < weatherArray.size(); i++) {
            String cloudCondition = weatherArray.get(i);
            if (!map.containsKey(cloudCondition)) {
                map.put(cloudCondition, 1);  // Initialize count to 1 for new condition
            } else {
                map.put(cloudCondition, map.get(cloudCondition) + 1);  // Increment count for existing condition
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Condition: " + key + " | Count: " + value);
        }
        return map;
    }

    public HashMap<String, Integer> weatherIdCounter() {
        List<WeatherObject> newList = weatherResponse.creatingListOfWeatherObjects(weatherResponse);

        ArrayList<Integer> weatherIdArray = new ArrayList<>();

        for (int i = 0; i < newList.size() - 34; i++) {
            weatherIdArray.add(newList.get(i).getWeather()[0].getId());
        }

        int counterDrizzle = countNumbersInRange(300, 321, weatherIdArray);
        int counterRain = countNumbersInRange(500, 531, weatherIdArray);
        int counterClearSky = countNumbersInRange(801, 803, weatherIdArray);
        int counterStorm = countNumbersInRange(200, 232, weatherIdArray);

        HashMap<String, Integer> forecast = new HashMap<>();
        forecast.put("Drizzle", counterDrizzle);
        forecast.put("Rain", counterRain);
        forecast.put("Clear Sky", counterClearSky);
        forecast.put("Storm", counterStorm);

        HashMap<Integer, Integer> idMap = new HashMap<>();
        for (int i = 0; i < weatherIdArray.size(); i++) {
            Integer cloudCondition = weatherIdArray.get(i);
            if (!idMap.containsKey(cloudCondition)) {
                idMap.put(cloudCondition, 1);  // Initialize count to 1 for new condition
            } else {
                idMap.put(cloudCondition, idMap.get(cloudCondition) + 1);  // Increment count for existing condition
            }
        }

        for (Map.Entry<String, Integer> entry : forecast.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Condition: " + key + " | Count: " + value);
        }
        return forecast;
    }

    public Double forecastTimeLap() {
        List<WeatherObject> newList = weatherResponse.creatingListOfWeatherObjects(weatherResponse);
        ArrayList<LocalDateTime> weatherArray = new ArrayList<>();

        for (int i = 0; i < newList.size() - 33; i++) {
            weatherArray.add(newList.get(i).getTimestamp());
        }
        LocalDateTime beginningTime = null;
        LocalDateTime endTime = null;
        double hoursLap = 0.0;
        beginningTime = weatherArray.get(0);
        endTime = weatherArray.get(6);
        Duration duration = Duration.between(beginningTime, endTime);
        hoursLap = duration.toHours();
        System.out.println(("ForecastForNextHours: " + hoursLap));
        return hoursLap;
    }


    public static int countNumbersInRange(int start, int end, ArrayList<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number >= start && number <= end) {
                count++;
            }
        }
        return count;
    }


}


