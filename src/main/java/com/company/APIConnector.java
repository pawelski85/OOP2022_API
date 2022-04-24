package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class APIConnector {
    public String getData(String URL, String apiKey, Map<String, String> params) {
        String urlString = URL + "?";
        if (apiKey != null) {
            urlString += "apikey=" + apiKey;
        }
        if (params != null) {

        }
//
//        public static final String API_KEY = "J2jjfIXN8zQeFc5fYqny0x6vMu5Sc84ScMAG4yVl";
//        public static final String URL_ADDRESS = "https://freecurrencyapi.net/api/v2/latest?apikey=";

        try {
            URL requestAddress = new URL(urlString);
            String readLine = null;
            HttpURLConnection conection = (HttpURLConnection) requestAddress.openConnection();
            conection.setRequestMethod("GET");
            int responseCode = conection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
                StringBuffer response = new StringBuffer();
                while ((readLine = in.readLine()) != null) {
                    response.append(readLine);
                }
                in.close();
                //System.out.println(response);
                return response.toString();
            } else {
                throw new Exception("Error in API Call");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
