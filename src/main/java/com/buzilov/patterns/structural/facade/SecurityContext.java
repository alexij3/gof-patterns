package com.buzilov.patterns.structural.facade;

import com.buzilov.patterns.creational.factory.factories.UserFactory;
import com.buzilov.patterns.creational.factory.model.User;

public class SecurityContext {
    public static User getCurrentUser() {
        return new UserFactory().getUser(User.UserType.SIMPLE_USER, "user", "12345a");
    }
}
