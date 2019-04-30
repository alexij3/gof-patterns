package com.buzilov.patterns.structural.adapter;

import java.util.Currency;
import java.util.Locale;

public class AdapterExample {
    public static void main(String[] args) {
        Price price = new Price(400d, 0d, Currency.getInstance(new Locale("uk", "ua")));
        System.out.println(price.getCurrency().getCurrencyCode());
    }
}
