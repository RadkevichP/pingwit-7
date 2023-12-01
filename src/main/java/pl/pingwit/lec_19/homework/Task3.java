package pl.pingwit.lec_19.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Task3 {

    public static void main(String[] args) {

        // здесь нужно написать код, чтобы спросить у пользователя город, где искать банкоматы, и потом подставить в шаблон
        String urlTemplate = "https://belarusbank.by/api/atm?city=%s";

        try {
            String jsonResponse = sendHttpGetRequest("здесь подставьте свой URL");

            ATM[] atms = parseJsonResponse(jsonResponse);

            // Display the parsed objects
            for (ATM obj : atms) {
                System.out.println(obj);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String sendHttpGetRequest(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    response.append(line);
                }
                return response.toString();
            }
        } else {
            throw new IOException("HTTP GET request failed with response code: " + responseCode);
        }
    }

    private static ATM[] parseJsonResponse(String jsonResponse) throws IOException {
        // допишите метод
        return null;
    }
}

