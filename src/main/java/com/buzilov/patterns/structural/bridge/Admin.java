package com.buzilov.patterns.structural.bridge;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    public Admin(String username, String password, AdditionalFunctionality functionality) {
        super(username, password, functionality);
    }

    @Override
    public void saySomething() {
        System.out.println("I am Admin. I can do anything.");
    }

}
