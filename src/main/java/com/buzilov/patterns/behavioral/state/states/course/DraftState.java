package com.buzilov.patterns.behavioral.state.states.course;

import com.buzilov.patterns.behavioral.state.Course;

public class DraftState extends CourseState {

    public DraftState(Course course) {
        super(course);
    }

    @Override
    public void show() {
        System.out.println("Showing course in the draft...");
        System.out.println(course);
    }

    @Override
    public void publish() {
        System.out.printf("Sending the course '%s' for moderating.%n", course.getName());
        course.setState(new InModerationState(course));
    }
}
