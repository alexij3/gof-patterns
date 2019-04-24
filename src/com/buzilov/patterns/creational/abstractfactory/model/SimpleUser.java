package com.buzilov.patterns.creational.abstractfactory.model;

public class SimpleUser extends User {

    @Override
    public void saySomething() {
        System.out.println("I am a simple user. I can take courses.");
    }
}
