package com.buzilov.patterns.creational.abstractfactory.model;

public class ContentManager extends User {

    @Override
    public void saySomething() {
        System.out.println("I am a Content Manager. I can create and delete courses, and do something else.");
    }
}
