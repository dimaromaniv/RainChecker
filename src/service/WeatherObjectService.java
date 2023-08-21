package service;

import models.WeatherObject;

public class WeatherObjectService {

    private WeatherObject weatherObject;

    public WeatherObjectService(WeatherObject weatherObject) {
        this.weatherObject = weatherObject;
    }

    public Double calculateWeather(WeatherObject weatherObject) {
        WeatherObject calculatingWeatherObject = weatherObject;
        Double temperature =  calculatingWeatherObject.getMain().getTemp();
        Double temperatureFeelsLike =  calculatingWeatherObject.getMain().getFeelsLike();
        Integer humidity = calculatingWeatherObject.getMain().getHumidity();
        Double maxTemperature = calculatingWeatherObject.getMain().getTempMax();


        return null;
    }
}
