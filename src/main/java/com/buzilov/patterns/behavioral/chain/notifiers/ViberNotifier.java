package com.buzilov.patterns.behavioral.chain.notifiers;

import com.buzilov.patterns.behavioral.chain.model.Course;
import com.buzilov.patterns.behavioral.chain.model.Event;
import com.buzilov.patterns.behavioral.chain.model.NewCourseAddedEvent;
import com.buzilov.patterns.behavioral.chain.model.User;
import com.buzilov.patterns.behavioral.chain.repository.UserRepository;

public class ViberNotifier extends Notifier {

    public ViberNotifier( Event event) {
        super(event);
    }

    @Override
    public void notifyUser() {
        if (event instanceof NewCourseAddedEvent) {
            Course course = ((NewCourseAddedEvent)event).getAddedCourse();
            System.out.printf("Notifying users subscribed to author '%s' about new course '%s'%n", course.getAuthor().getUsername(),
                    course.getName());
            User subscribedUser = UserRepository.users.get(1);
            if (subscribedUser.getPhone() != null && !subscribedUser.getPhone().isEmpty() && subscribedUser.getPhoneNotificationsEnabled()) {
                System.out.printf("Sent a SMS to user with phone '%s'%n", subscribedUser.getPhone());
            } else if (nextNotifier != null){
                System.out.printf("Could not send a SMS to user with phone %s%n", subscribedUser.getPhone());
                nextNotifier.notifyUser();
            } else {
                System.out.println("Could not notify user about new course available!");
            }
        }
    }
}
