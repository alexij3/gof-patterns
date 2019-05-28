package com.buzilov.patterns.structural.bridge;

public class SimpleUser extends User {

    public SimpleUser(String username, String password) {
        super(username, password);
    }

    public SimpleUser(String username, String password, AdditionalFunctionality functionality) {
        super(username, password, functionality);
    }

    @Override
    public void saySomething() {
        System.out.println("I am a simple user. I can take courses.");
    }


}
