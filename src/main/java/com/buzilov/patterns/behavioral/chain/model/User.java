package com.buzilov.patterns.behavioral.chain.model;

public abstract class User {
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private Boolean personalMsgsEnabled = true;
    private Boolean emailNotificationsEnabled = true;
    private Boolean phoneNotificationsEnabled = true;

    protected User(Integer id, String username, String password, String phone, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getPersonalMsgsEnabled() {
        return personalMsgsEnabled;
    }

    public void setPersonalMsgsEnabled(Boolean personalMsgsEnabled) {
        this.personalMsgsEnabled = personalMsgsEnabled;
    }

    public Boolean getEmailNotificationsEnabled() {
        return emailNotificationsEnabled;
    }

    public void setEmailNotificationsEnabled(Boolean emailNotificationsEnabled) {
        this.emailNotificationsEnabled = emailNotificationsEnabled;
    }

    public Boolean getPhoneNotificationsEnabled() {
        return phoneNotificationsEnabled;
    }

    public void setPhoneNotificationsEnabled(Boolean phoneNotificationsEnabled) {
        this.phoneNotificationsEnabled = phoneNotificationsEnabled;
    }

    public Integer getId() {
        return id;
    }

    public enum UserType{
        SIMPLE_USER, ADMIN, CONTENT_MANAGER
    }
}
