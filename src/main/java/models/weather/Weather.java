package models.weather;

public class Weather{
    private int id;
    private String main;
    private String description;
    private String icon;

    public Weather (){}
    public Weather (String main ,String description , int id ){
        this.description = description;
        this.id = id;
        this.main = main;
    }

    public int getId() {
        return id;
    }


    public String getMain() {
        return main;
    }



    public String getDescription() {
        return description;
    }






}
