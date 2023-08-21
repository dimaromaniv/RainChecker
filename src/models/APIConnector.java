package models;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class APIConnector {
    private static final String API_KEY = "ab2e247272ffb4896f60b6786a1f8f84";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather";

    private static final HttpClient client = HttpClient.newHttpClient();

    public APIConnector() {
    }

    ;

    public WeatherObject getAPI() {
        WeatherObject answerFromAPI = new WeatherObject();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a city name: ");
        StringBuilder cityName;
        cityName = new StringBuilder(scanner.nextLine());
        cityName = removeWhiteSpaces(cityName);
        System.out.print("Enter a country name:");
        StringBuilder country ;
        country = new StringBuilder(scanner.nextLine());
        country = removeWhiteSpaces(country);
        scanner.close();

        // The variable which will give access to diferent city

        String apiURL = API_URL + "?q=" + cityName + "," + country + "&APPID=" + API_KEY + "&units=metric";

        HttpRequest request = null;
        try {
            request = HttpRequest.newBuilder()
                    .uri(new URI(apiURL))
                    .build();
        } catch (URISyntaxException e) {
          //  System.out.println("Please use only letters");
            throw new RuntimeException();
        }

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            Gson gson = new Gson();

            answerFromAPI = gson.fromJson(responseBody, WeatherObject.class);
            System.out.println(responseBody);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return answerFromAPI;
    }

    public StringBuilder removeWhiteSpaces(StringBuilder inputString) {
        if (inputString.charAt(inputString.length() - 1) == ' ') {
            inputString = new StringBuilder(new StringBuilder(inputString).deleteCharAt(inputString.length() - 1).toString());
            if (inputString.charAt(inputString.length() - 1) == ' ') {
                inputString = new StringBuilder(new StringBuilder(inputString).deleteCharAt(inputString.length() - 1).toString());
            }
        }
        return inputString;
    }
}
