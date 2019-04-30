package com.buzilov.patterns.structural.adapter;

import java.util.Currency;

public class Price {
    private Double price;
    private Double discount;
    private Currency currency;

    public Price() {
    }

    public Price(Double price, Double discount, Currency currency) {
        this.price = price;
        this.discount = discount;
        this.currency = currency;
    }

    public Double getPrice() {
        return price - (price * discount);
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
