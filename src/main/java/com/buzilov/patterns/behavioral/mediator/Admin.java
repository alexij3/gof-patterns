package com.buzilov.patterns.behavioral.mediator;

import com.buzilov.patterns.behavioral.visitor.UsersVisitor;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void saySomething() {
        System.out.println("I am Admin. I can do anything.");
    }

}
