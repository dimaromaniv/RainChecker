package models.weather;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SysTest {

    @Test
    public void testGetters() {
        // Create a Sys instance with sample data
        int type = 1;
        int id = 123;
        long sunrise = 1629999999L; // Sample sunrise timestamp
        long sunset = 1630050000L; // Sample sunset timestamp
        Sys sys = new Sys(type, id, sunset, sunrise);

        // Test the getters
        assertEquals(type, sys.getType());
        assertEquals(id, sys.getId());
        assertEquals(sunrise, sys.getSunrise());
        assertEquals(sunset, sys.getSunset());
    }

}