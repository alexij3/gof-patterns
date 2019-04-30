package com.buzilov.patterns.creational.abstractfactory.model;

public class Admin extends User {

    @Override
    public void saySomething() {
        System.out.println("I am Admin. I can do anything.");
    }


}
