package com.buzilov.patterns.creational.abstractfactory.factories;

import com.buzilov.patterns.creational.abstractfactory.model.Course;
import com.buzilov.patterns.creational.abstractfactory.model.Event;
import com.buzilov.patterns.creational.abstractfactory.model.MasterClass;
import com.buzilov.patterns.creational.abstractfactory.model.ObjectType;

public class EventFactory implements AbstractFactory<Event>{
    public Event create(ObjectType eventType) {
        if (eventType == Event.EventType.COURSE) {
            return new Course();
        } else if (eventType == Event.EventType.MASTER_CLASS) {
            return new MasterClass();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
