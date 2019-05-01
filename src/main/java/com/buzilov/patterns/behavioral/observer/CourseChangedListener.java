package com.buzilov.patterns.behavioral.observer;

import static com.buzilov.patterns.behavioral.observer.ObserverExample.COURSE_PRICE_CHANGED;

public class CourseChangedListener implements IObserver {
    private Course course;
    private IEmailService emailService = new EmailService();

    public CourseChangedListener(Course course) {
        this.course = course;
    }

    @Override
    public void update(String eventType, Object oldObject, Object newObject) {
        switch (eventType) {
            case COURSE_PRICE_CHANGED:
                System.out.printf("Change of the price of the course with id %d occured. Sending notification...%n", ((Course)newObject).getId());
                emailService.sendEmailAboutChange(eventType, oldObject, newObject);
                break;

            default:
                break;
        }
    }
}
