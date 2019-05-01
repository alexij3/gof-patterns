package com.buzilov.patterns.behavioral.state.states.course;

import com.buzilov.patterns.behavioral.state.Course;

public class PublishedState extends CourseState {

    public PublishedState(Course course) {
        super(course);
    }

    @Override
    public void show() {
        System.out.println("Showing course's '%s' contents...");
        System.out.println(course);
    }

    @Override
    public void publish() {

    }
}
