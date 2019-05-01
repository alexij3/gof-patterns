package com.buzilov.patterns.behavioral.strategy;

import com.buzilov.patterns.behavioral.strategy.controller.AuthenticationController;

public class StrategyExample {
    private static AuthenticationController authenticationController = new AuthenticationController();

    public static void main(String[] args) {
        String username = "Vasya";
        String password = "12345";

        authenticationController.authenticate(username, password, "Google");
        authenticationController.authenticate(username, password, "Facebook");
        authenticationController.authenticate(username, password, "");
    }
}
