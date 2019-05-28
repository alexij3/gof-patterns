package com.buzilov.patterns.structural.bridge;

public abstract class User {
    private String username;
    private String password;
    protected AdditionalFunctionality functionality;

    protected User(String username, String password, AdditionalFunctionality functionality) {
        this.username = username;
        this.password = password;
        this.functionality = functionality;
    }

    protected User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract void saySomething();

    public void doAdditionalFunctionality() {
        this.functionality.performFunctionality();
    }

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

    public AdditionalFunctionality getFunctionality() {
        return functionality;
    }

    public void setFunctionality(AdditionalFunctionality functionality) {
        this.functionality = functionality;
    }

    public enum UserType{
        SIMPLE_USER, ADMIN, CONTENT_MANAGER
    }
}
