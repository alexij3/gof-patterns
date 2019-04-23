package com.buzilov.patterns.creational.factory.factories;

import com.buzilov.patterns.creational.factory.model.Admin;
import com.buzilov.patterns.creational.factory.model.ContentManager;
import com.buzilov.patterns.creational.factory.model.SimpleUser;
import com.buzilov.patterns.creational.factory.model.User;

public class UserFactory {
    public User getUser(User.UserType userType, String username, String password) {
        switch(userType) {
            case SIMPLE_USER:
                return new SimpleUser(username, password);
            case ADMIN:
                return new Admin(username, password);
            case CONTENT_MANAGER:
                return new ContentManager(username, password);
            default:
                throw new IllegalArgumentException();
        }
    }
}
