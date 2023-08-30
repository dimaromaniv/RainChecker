package models.weather;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testGetters() {
        // Create a Main instance with sample data
        double temp = 25.5;
        double feelsLike = 26.2;
        double tempMin = 24.0;
        double tempMax = 28.0;
        int pressure = 1012;
        int humidity = 70;
        int seaLevel = 1015;
        int groundLevel = 1010;
        Main main = new Main(temp, feelsLike, tempMin, tempMax, pressure, humidity, seaLevel, groundLevel);

        // Test the getters
        assertEquals(temp, main.getTemp(), 0.001); // Using a delta for double comparison
        assertEquals(feelsLike, main.getFeelsLike(), 0.001);
        assertEquals(tempMin, main.getTempMin(), 0.001);
        assertEquals(tempMax, main.getTempMax(), 0.001);
        assertEquals(pressure, main.getPressure());
        assertEquals(humidity, main.getHumidity());
        assertEquals(seaLevel, main.getSeaLevel());
        assertEquals(groundLevel, main.getGroundLevel());
    }

    @Test
    public void testToString() {
        // Create a Main instance with sample data
        double temp = 25.5;
        double feelsLike = 26.2;
        double tempMin = 24.0;
        double tempMax = 28.0;
        int pressure = 1012;
        int humidity = 70;
        int seaLevel = 1015;
        int groundLevel = 1010;
        Main main = new Main(temp, feelsLike, tempMin, tempMax, pressure, humidity, seaLevel, groundLevel);

        // Test the toString method
        String expectedToString = "Main{" +
                "temp=" + temp +
                ", feelsLike=" + feelsLike +
                ", tempMin=" + tempMin +
                ", tempMax=" + tempMax +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", seaLevel=" + seaLevel +
                ", groundLevel=" + groundLevel +
                '}';
        assertEquals(expectedToString, main.toString());
    }

}