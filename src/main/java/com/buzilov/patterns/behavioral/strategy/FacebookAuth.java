package com.buzilov.patterns.behavioral.strategy;

public class FacebookAuth implements Authenticator {
    @Override
    public boolean login(String username, String password) {
        System.out.printf("Authenticating user '%s' using Facebook.%n", username);
        return true;
    }
}
