package models.weather;

public class Wind {
    private double speed;
    private int deg;

    public Wind(){}
    public Wind(double speed,int deg){
        this.deg = deg;
        this.speed=speed;
    }
    public double getSpeed() {
        return speed;
    }

    public int getDeg() {
        return deg;
    }


}
