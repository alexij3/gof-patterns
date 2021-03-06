package com.buzilov.patterns.behavioral.mediator;

import com.buzilov.patterns.behavioral.visitor.UsersVisitor;

public class ContentManager extends User {

    public ContentManager(String username, String password) {
        super(username, password);
    }

    @Override
    public void saySomething() {
        System.out.println("I am a Content Manager. I can create and delete courses, and do something else.");
    }

}
