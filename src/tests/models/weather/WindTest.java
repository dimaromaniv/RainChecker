package models.weather;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindTest {
    @Test
    public void testGetSpeed() {
        Wind wind = new Wind(10.5, 180);
        double expectedSpeed = 10.5;
        double actualSpeed = wind.getSpeed();
        assertEquals(expectedSpeed, actualSpeed, 0.01); // Delta allows for floating-point precision
    }

    @Test
    public void testGetDeg() {
        Wind wind = new Wind(7.2, 270);
        int expectedDeg = 270;
        int actualDeg = wind.getDeg();
        assertEquals(expectedDeg, actualDeg);
    }
}