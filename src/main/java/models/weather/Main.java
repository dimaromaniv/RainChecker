package models.weather;

import com.google.gson.annotations.SerializedName;

public class Main {
    public double temp;
    @SerializedName("feels_like")
    private double feelsLike;
    @SerializedName("temp_min")
    private double tempMin;
    @SerializedName("temp_max")
    private double tempMax;
    private int pressure;
    private int humidity;
    @SerializedName("sea_level")
    private int seaLevel;
    @SerializedName("grnd_level")
    private int groundLevel;
    // Getter and Setter methods


    public Main(double temp, double feelsLike , double tempMin, double tempMax, int pressure , int humidity , int seaLevel , int groundLevel) {
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.tempMin = tempMin ;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
        this.seaLevel = seaLevel;
        this.groundLevel = groundLevel;

    }

    public double getTemp() {
        return temp;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public double getTempMin() {
        return tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getSeaLevel() {
        return seaLevel;
    }

    public int getGroundLevel() {
        return groundLevel;
    }

    public String toString() {
        return "Main{" +
                "temp=" + temp +
                ", feelsLike=" + feelsLike +
                ", tempMin=" + tempMin +
                ", tempMax=" + tempMax +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", seaLevel=" + seaLevel +
                ", groundLevel=" + groundLevel +
                '}';
    }
}
