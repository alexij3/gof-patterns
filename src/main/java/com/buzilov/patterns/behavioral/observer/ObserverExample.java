package com.buzilov.patterns.behavioral.observer;

import java.util.Arrays;
import java.util.Date;

public class ObserverExample {
    public static final String COURSE_PRICE_CHANGED = "COURSE_PRICE_CHANGED";

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder(1, "First course", "First description", new Date(), new Date())
                .setAgeLimit(10)
                .setPrice(100d)
                .setTags(Arrays.asList("General", "Health"))
                .build();

        CourseChangedListener courseChangedListener = new CourseChangedListener(course);
        course.addObserver(courseChangedListener);

        course.setPrice(150d);
    }
}
