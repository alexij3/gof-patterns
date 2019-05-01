package com.buzilov.patterns.behavioral.chain;

import com.buzilov.patterns.behavioral.chain.model.*;
import com.buzilov.patterns.behavioral.chain.notifiers.EmailNotifier;
import com.buzilov.patterns.behavioral.chain.notifiers.Notifier;
import com.buzilov.patterns.behavioral.chain.notifiers.PersonalMessageNotifier;
import com.buzilov.patterns.behavioral.chain.notifiers.ViberNotifier;
import com.buzilov.patterns.behavioral.chain.repository.UserRepository;

import java.util.Date;

public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        User subscribedUser = new SimpleUser(1, "vasya", "123", null, "vasya.email@gmail.com");;
        UserRepository.users.put(subscribedUser.getId(), subscribedUser);
        User author = new SimpleUser(2, "author", "1234", "+380506853231", "author@gmail.com");
        Course course = new Course.CourseBuilder(1, "Mega course", "Mega description", new Date(), new Date(), author).build();

        Event newCourseAdded = new NewCourseAddedEvent(course);

        Notifier emailNotifier = new EmailNotifier(newCourseAdded);
        Notifier viberNotifier = new ViberNotifier(newCourseAdded);
        Notifier personalNotifier = new PersonalMessageNotifier(newCourseAdded);

        emailNotifier.setNextNotifier(viberNotifier);
        viberNotifier.setNextNotifier(personalNotifier);

        UserRepository.users.get(1).setEmailNotificationsEnabled(false);

        emailNotifier.notifyUser();
    }
}
