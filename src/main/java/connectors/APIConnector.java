package connectors;

import com.google.gson.Gson;
import weatherdata.WeatherResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class APIConnector {
    private static final String API_KEY = "ab2e247272ffb4896f60b6786a1f8f84";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/forecast";
    private static final HttpClient client = HttpClient.newHttpClient();

    public APIConnector() {
    }

    public WeatherResponse getAPI() {
        //input from the user
//        String cityName = inputFromUserCity();
//        String country = inputFromUserCountry();

//        API keyvand URL address
//        String apiURL = API_URL + "?q=" + cityName + "," + country + "&limit=1" + "&APPID=" + API_KEY + "&units=metric";

        String apiURL = "http://api.openweathermap.org/data/2.5/forecast?q=new+york&appid=ab2e247272ffb4896f60b6786a1f8f84&units=metric";

        HttpRequest request = null;
        try {
            request = HttpRequest.newBuilder()
                    .uri(new URI(apiURL.toString()))
                    .build();
        } catch (URISyntaxException e) {
            //  System.out.println("Please use only letters");
            throw new RuntimeException();
        }

        WeatherResponse weatherResponse = null;
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            Gson gson = new Gson();

            weatherResponse = gson.fromJson(responseBody, WeatherResponse.class);
//            System.out.println(responseBody);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return weatherResponse;
    }

    public String inputFromUserCity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city name: ");
        StringBuilder cityName;
        cityName = new StringBuilder(scanner.nextLine());
        cityName = removeWhiteSpaces(cityName);
        cityName = new StringBuilder(containsOnlyLetters(cityName.toString()));

        return cityName.toString();
    }

    public String inputFromUserCountry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a country name:");
        StringBuilder country;
        country = new StringBuilder(scanner.nextLine());
        country = removeWhiteSpaces(country);
        country = new StringBuilder(containsOnlyLetters(country.toString()));

        scanner.close();
        return country.toString();
    }

    public String containsOnlyLetters(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i < input.length() ; i++) {
             if (Character.isLetter(input.charAt(i)) || input.charAt(i) == ' '){
                    result.append(input.charAt(i));
             }
        }
        for (int j = 0 ; j < result.length() ; j++) {
            if (result.charAt(j) == ' ') {
                result.replace(j,j+1,"+");
            }
        }

        return result.toString();
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
