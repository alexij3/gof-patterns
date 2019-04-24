package com.buzilov.patterns.creational.abstractfactory.factories;

import com.buzilov.patterns.creational.abstractfactory.model.*;

public class UserFactory implements AbstractFactory<User>{
    @Override
    public User create(ObjectType objectType) {
        if (objectType == User.UserType.SIMPLE_USER) {
            return new SimpleUser();
        } else if (objectType == User.UserType.ADMIN) {
            return new Admin();
        } else if (objectType == User.UserType.CONTENT_MANAGER) {
            return new ContentManager();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
