package com.buzilov.patterns.behavioral.strategy;

public interface Authenticator {
    boolean login(String username, String password);
}
