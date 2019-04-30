package com.buzilov.patterns.structural.adapter;

import java.util.Currency;
import java.util.Locale;

public class AdapterExample {
    public static void main(String[] args) {
        Price price = new Price(100d, Currency.getInstance(Locale.US));
        System.out.println("Price: " + price.toString());
        Locale locale = new Locale("uk", "ua");
        BillableAdapter priceAdapter = new BillableAdapterImpl(price, locale);
        System.out.printf("Price for locale [%s]: %s", locale.getDisplayName(Locale.US), priceAdapter.getPrice());
    }
}
