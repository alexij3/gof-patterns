package com.buzilov.patterns.structural.bridge;

public class ContentManager extends User {

    public ContentManager(String username, String password) {
        super(username, password);
    }

    public ContentManager(String username, String password, AdditionalFunctionality functionality) {
        super(username, password, functionality);
    }

    @Override
    public void saySomething() {
        System.out.println("I am a Content Manager. I can create and delete courses, and do something else.");
    }
}
