package com.buzilov.patterns.behavioral.observer;

import static com.buzilov.patterns.behavioral.observer.ObserverExample.COURSE_PRICE_CHANGED;

public class EmailService implements IEmailService {
    @Override
    public void sendEmailAboutChange(String eventType, Object oldOjbect, Object newObject) {
        switch (eventType) {
            case COURSE_PRICE_CHANGED:
                sendEmailCoursePriceChanged((Double) oldOjbect, (Course) newObject);
        }
    }

    @Override
    public void sendEmailCoursePriceChanged(Double oldPrice, Course courseWithNewPrice) {
        /* Logic of retrieving the users subscribed to this course
                   and notifying them about the change of its price. */
        System.out.printf("Notification: Course with id %d and name '%s' changed its price from %f to %f.%n", courseWithNewPrice.getId(),
                        courseWithNewPrice.getName(), oldPrice, courseWithNewPrice.getPrice());
    }
}
