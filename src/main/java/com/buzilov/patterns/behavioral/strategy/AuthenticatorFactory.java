package com.buzilov.patterns.behavioral.strategy;

public class AuthenticatorFactory {
    public static Authenticator getAuthenticator(String authType) {
        switch(authType) {
            case "Google":
                return new GoogleAuth();
            case "Facebook":
                return new FacebookAuth();
            default:
                return new SimpleAuth();
        }
    }
}
