package com.buzilov.patterns.structural.adapter;

import java.util.Currency;

public interface Billable {
    Double getPrice();
    Currency getCurrency();
}
