package models.weather;

public class Weather{
    private int id;
    private String main;
    private String description;
    private String icon;

    public Weather (){}
    public Weather (String description , int id ){
        this.description = description;
        this.id = id;
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



    public String getIcon() {
        return icon;
    }


}
