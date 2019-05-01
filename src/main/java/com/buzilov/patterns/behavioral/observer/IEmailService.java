package com.buzilov.patterns.behavioral.observer;

public interface IEmailService {
    void sendEmailAboutChange(String eventType, Object oldObject, Object newObject);
    void sendEmailCoursePriceChanged(Double oldPrice, Course courseWithNewPrice);
}
