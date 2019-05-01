package com.buzilov.patterns.behavioral.state.states.course;

import com.buzilov.patterns.behavioral.state.Course;

public abstract class CourseState {
    protected Course course;

    public CourseState(Course course) {
        this.course = course;
    }

    public abstract void show();

    public abstract void publish();
}
