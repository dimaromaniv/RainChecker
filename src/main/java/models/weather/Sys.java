package models.weather;



public class Sys  {
    private int type;
    private int id;
    private long sunrise;
    private long sunset;

    public Sys (){}
    public Sys (Integer type,Integer id , Long sunset ,Long sunrise){
        this.id = id;
        this.type = type;
        this.sunrise= sunrise;
        this.sunset = sunset;
    }
    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public long getSunrise() {
        return sunrise;
    }


    public long getSunset() {
        return sunset;
    }

}
