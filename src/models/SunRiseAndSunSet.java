package models;

public class SunRiseAndSunSet {
    private String country;
    private long sunrise;
    private long sunset;
    public SunRiseAndSunSet(){
        this.country = null;
        this.sunrise = 0;
        this.sunset = 0;
    }
    public SunRiseAndSunSet(String country ,long sunrise,long sunset){
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }
}
