package com.buzilov.patterns.behavioral.chain.model;

public class SimpleUser extends User {

    public SimpleUser(Integer id, String username, String password, String phone, String email) {
        super(id, username, password, phone, email);
    }

    @Override
    public void saySomething() {
        System.out.println("I am a simple user. I can take courses.");
    }
}
