package connectors;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class APIConnectorTest {

    @Test
    void removeWhiteSpacesTest() {
        APIConnector apiConnector = new APIConnector();

        StringBuilder input = new StringBuilder("new yo74rk ");
        String expected = "new yo74rk";
        StringBuilder acctual = new StringBuilder(apiConnector.removeWhiteSpaces(input));

        Assert.assertEquals(expected,acctual.toString());
    }
    @Test
    void containsOnlyLettersTest() {
        APIConnector apiConnector = new APIConnector();

        String input  = "new yo74rk";
        String expected = "new+york";
        String actual = apiConnector.containsOnlyLetters(input);
        Assert.assertEquals(expected,actual);

    }

    @Test
    void inputFromUserCountry() {
    }

    @Test
    void removeWhiteSpaces() {
    }
}