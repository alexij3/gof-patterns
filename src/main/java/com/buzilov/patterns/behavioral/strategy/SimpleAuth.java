package com.buzilov.patterns.behavioral.strategy;

public class SimpleAuth implements Authenticator {
    @Override
    public boolean login(String username, String password) {
        System.out.printf("Simply authenticating user '%s'.%n", username);
        return true;
    }
}
