import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class WeatherApp {
    private static final String API_KEY = "ab2e247272ffb4896f60b6786a1f8f84";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather";

    private static final HttpClient client = HttpClient.newHttpClient();

    public static void main(String[] args) throws URISyntaxException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a city name: ");
        String cityName = scanner.nextLine();
        System.out.print("Enter a country name:");
        String country  = scanner.nextLine();
        scanner.close();

        // The variable which will give access to diferent city

        String apiURL = API_URL + "?q=" + cityName + "," + country + "&APPID=" + API_KEY + "&units=metric";


        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(apiURL))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            Gson gson = new Gson();

           WeatherData g = gson.fromJson(responseBody,WeatherData.class);


            double  temp = g.getMain().getTemp();
            int hum = g.getMain().getHumidity();
           long s = g.getSunRise().getSunrise();

           System.out.println(temp);
            System.out.println(hum);
            System.out.println(s);
            // Process and display the weather data here
            System.out.println(responseBody);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
