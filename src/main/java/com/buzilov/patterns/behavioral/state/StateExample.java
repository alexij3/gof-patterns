package com.buzilov.patterns.behavioral.state;

import com.buzilov.patterns.behavioral.state.states.course.DraftState;

import java.util.Arrays;
import java.util.Date;

public class StateExample {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder(1, "First course", "First description", new Date(), new Date())
                .setAgeLimit(10)
                .setPrice(100d)
                .setTags(Arrays.asList("General", "Health"))
                .build();

        course.setState(new DraftState(course));

        course.show();
        course.publish();

        course.show();
        course.publish();

        course.show();
        course.publish();
    }
}
