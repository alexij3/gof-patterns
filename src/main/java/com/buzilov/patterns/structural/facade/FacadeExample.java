package com.buzilov.patterns.structural.facade;

public class FacadeExample {
    public static void main(String[] args) {
        SubscriptionFacade subscriptionFacade = new SubscriptionFacadeImpl();
        subscriptionFacade.subscribe(1);
    }
}
