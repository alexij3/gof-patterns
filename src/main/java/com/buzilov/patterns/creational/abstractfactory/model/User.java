package com.buzilov.patterns.creational.abstractfactory.model;

public abstract class User {
    private String username;
    private String password;

    public abstract void saySomething();

    void login() {
        // Login logic...
    }

    void logout() {
        // Logout logic...
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public enum UserType implements ObjectType{
        SIMPLE_USER, ADMIN, CONTENT_MANAGER
    }
}
