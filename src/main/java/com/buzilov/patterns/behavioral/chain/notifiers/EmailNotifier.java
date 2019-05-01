package com.buzilov.patterns.behavioral.chain.notifiers;

import com.buzilov.patterns.behavioral.chain.model.Course;
import com.buzilov.patterns.behavioral.chain.model.Event;
import com.buzilov.patterns.behavioral.chain.model.NewCourseAddedEvent;
import com.buzilov.patterns.behavioral.chain.model.User;
import com.buzilov.patterns.behavioral.chain.repository.UserRepository;

public class EmailNotifier extends Notifier {

    public EmailNotifier(Event event) {
        super(event);
    }

    @Override
    public void notifyUser() {
        if (event instanceof NewCourseAddedEvent) {
            Course course = ((NewCourseAddedEvent)event).getAddedCourse();
            System.out.printf("Notifying users subscribed to author '%s' about new course '%s'%n", course.getAuthor().getUsername(),
                                course.getName());
            User subscribedUser = UserRepository.users.get(1);
            if (subscribedUser.getEmailNotificationsEnabled()) {
                System.out.printf("Sent an email to user with email '%s'%n", subscribedUser.getEmail());
            } else if (nextNotifier != null){
                System.out.println("Could not send an email.");
                nextNotifier.notifyUser();
            } else {
                System.out.println("Could not notify user about new course available!");
            }
        }
    }
}
