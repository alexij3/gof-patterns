package com.buzilov.patterns.behavioral.strategy;

public class GoogleAuth implements Authenticator {
    @Override
    public boolean login(String username, String password) {
        System.out.printf("Authenticating user '%s' using Google.%n", username);
        return true;
    }
}
