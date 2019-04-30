package com.buzilov.patterns.structural.adapter;

import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PriceAdapter {
    private Price price;

    public PriceAdapter() {
    }

    public PriceAdapter(Price price) {
        this.price = price;
    }

    public Double getPrice(Locale locale) {
        try {
            Double numericPrice = null;
            URL url = new URL("https://free.currconv.com/api/v7/convert");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            String from = price.getCurrency().getCurrencyCode();
            String to = Currency.getInstance(locale).getCurrencyCode();

            Map<String, String> params = new HashMap<>();

            params.put("q", from + "," + to);
            params.put("compact", "ultra");
            params.put("apiKey", "41fd8c894f3241c3a491");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            con.disconnect();


            return numericPrice;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
