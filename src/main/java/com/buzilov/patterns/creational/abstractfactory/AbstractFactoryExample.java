package com.buzilov.patterns.creational.abstractfactory;

import com.buzilov.patterns.creational.abstractfactory.factories.AbstractFactory;
import com.buzilov.patterns.creational.abstractfactory.factories.FactoryProvider;
import com.buzilov.patterns.creational.abstractfactory.factories.FactoryType;
import com.buzilov.patterns.creational.abstractfactory.model.Event;
import com.buzilov.patterns.creational.abstractfactory.model.User;

import java.util.Arrays;
import java.util.List;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        try {
            AbstractFactory<Event> eventFactory = FactoryProvider.getFactory(FactoryType.EVENT);
            Event course = eventFactory.create(Event.EventType.COURSE);
            Event masterClass = eventFactory.create(Event.EventType.MASTER_CLASS);

            course.showInfo();
            masterClass.showInfo();

            AbstractFactory<User> userFactory = FactoryProvider.getFactory(FactoryType.USER);
            User simpleUser = userFactory.create(User.UserType.SIMPLE_USER);
            User admin = userFactory.create(User.UserType.ADMIN);
            User contentManager = userFactory.create(User.UserType.CONTENT_MANAGER);

            List<User> users = Arrays.asList(simpleUser, admin, contentManager);

            for (User user : users) {
                user.saySomething();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
