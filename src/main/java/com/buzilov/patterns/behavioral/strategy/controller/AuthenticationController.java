package com.buzilov.patterns.behavioral.strategy.controller;

import com.buzilov.patterns.behavioral.strategy.Authenticator;
import com.buzilov.patterns.behavioral.strategy.AuthenticatorFactory;

public class AuthenticationController {
    public boolean authenticate(String username, String password, String authType) {
        Authenticator authenticator = AuthenticatorFactory.getAuthenticator(authType);
        return authenticator.login(username, password);
    }
}
