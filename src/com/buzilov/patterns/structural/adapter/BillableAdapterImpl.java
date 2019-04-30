package com.buzilov.patterns.structural.adapter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Currency;
import java.util.Locale;

public class BillableAdapterImpl implements BillableAdapter{
    private Billable adaptee;
    private Locale locale;

    public BillableAdapterImpl() {
    }

    public BillableAdapterImpl(Billable price, Locale locale) {
        this.adaptee = price;
        this.locale = locale;
    }

    public BillableAdapterImpl(Price price) {
        this.adaptee = price;
    }

    public Double getPrice() {
        return convertPrice(locale);
    }

    private Double convertPrice(Locale locale) {
        Double convertedPrice = null;

        HttpURLConnection con = null;

        try {
            String rate = Currency.getInstance(locale).getCurrencyCode() + "_" + adaptee.getCurrency().getCurrencyCode();
            URL url = new URL("https://free.currconv.com/api/v7/convert?q=" + rate + "&compact=ultra&apiKey=41fd8c894f3241c3a491");
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode root = objectMapper.readTree(in);
            JsonNode priceNode = root.path(rate);

            convertedPrice = adaptee.getPrice() / priceNode.asDouble();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.disconnect();
            }
        }

        return convertedPrice;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Billable getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(Billable adaptee) {
        this.adaptee = adaptee;
    }
}
