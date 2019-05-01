package com.buzilov.patterns.behavioral.state.states.course;

import com.buzilov.patterns.behavioral.state.Course;

public class InModerationState extends CourseState {

    public InModerationState(Course course) {
        super(course);
    }

    @Override
    public void show() {
        System.out.println("Showing course for moderator...");
        System.out.println(course);
    }

    @Override
    public void publish() {
        System.out.printf("Published course '%s'.%n", course.getName());
        course.setState(new PublishedState(course));
    }
}
