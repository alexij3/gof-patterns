package com.buzilov.patterns.behavioral.visitor.model;

import com.buzilov.patterns.behavioral.visitor.UsersVisitor;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void saySomething() {
        System.out.println("I am Admin. I can do anything.");
    }


    @Override
    public void accept(UsersVisitor visitor) {
        visitor.visitAdmin(this);
    }
}
