package com.buzilov.patterns.factorypattern;

import com.buzilov.patterns.factorypattern.factories.UserFactory;
import com.buzilov.patterns.factorypattern.model.User;

public class FactoryMethodExample {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();

        User simpleUser = userFactory.getUser(User.UserType.SIMPLE_USER, "user", "12345");
        User adminUser = userFactory.getUser(User.UserType.ADMIN, "admin", "admin");
        User manager =  userFactory.getUser(User.UserType.CONTENT_MANAGER, "manager", "manager");

        simpleUser.saySomething();
        adminUser.saySomething();
        manager.saySomething();
    }
}
