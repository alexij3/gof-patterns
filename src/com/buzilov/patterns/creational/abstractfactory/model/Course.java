package com.buzilov.patterns.creational.abstractfactory.model;

public class Course extends Event {

    @Override
    public void showInfo() {
        System.out.println("Inside Course");
    }
}
