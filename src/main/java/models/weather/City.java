package models.weather;

public class City {
    private String country;
    private int population;
    private int timezone;

    public City() {
        // Default constructor
    }

    public City(String country, int population, int timezone) {
        this.country = country;
        this.population = population;
        this.timezone = timezone;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public int getTimezone() {
        return timezone;
    }

    @Override
    public String toString() {
        return "Country: " + country + "\n" +
                "Population: " + population + "\n" +
                "Timezone: " + timezone + "\n";
    }
}
