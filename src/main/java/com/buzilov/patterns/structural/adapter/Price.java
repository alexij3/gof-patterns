package com.buzilov.patterns.structural.adapter;

import java.util.Currency;

public class Price implements Billable{
    private Double price;
    private Currency currency;

    public Price() {
    }

    public Price(Double price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return getPrice() + " " + currency.getCurrencyCode();
    }
}
