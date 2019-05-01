package com.buzilov.patterns.behavioral.chain.model;

public class NewCourseAddedEvent implements Event {
    private final Course addedCourse;

    public NewCourseAddedEvent(Course addedCourse) {
        this.addedCourse = addedCourse;
    }

    public Course getAddedCourse() {
        return addedCourse;
    }
}
