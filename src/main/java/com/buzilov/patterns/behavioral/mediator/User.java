package com.buzilov.patterns.behavioral.mediator;

public abstract class User {
    private String username;
    private String password;
    protected Mediator mediator;

    protected User(String username, String password) {
        this.username = username;
        this.password = password;
    }

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

    public void sendMessage(String msg) {
        mediator.notify(this, msg);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public enum UserType{
        SIMPLE_USER, ADMIN, CONTENT_MANAGER
    }
}
