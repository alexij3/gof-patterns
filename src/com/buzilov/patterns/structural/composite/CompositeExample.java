package com.buzilov.patterns.structural.composite;

import java.util.Arrays;
import java.util.Date;

public class CompositeExample {
    public static void main(String[] args) {
        Course courseWithAllFields = new Course.CourseBuilder(
                2, "Another name", "Another description", new Date(), new Date())
                .setAgeLimit(12)
                .setPrice(40d)
                .setTags(Arrays.asList("Awesome", "General"))
                .build();

        Course awesome2 = new Course.CourseBuilder(3, "Another name 2", "Another description 2", new Date(), new Date())
                .setAgeLimit(12)
                .setPrice(30d)
                .setTags(Arrays.asList("Awesome", "General"))
                .build();

        Course awesome3 = new Course.CourseBuilder(4, "Another name 3", "Another description 3", new Date(), new Date())
                .setAgeLimit(12)
                .setPrice(20d)
                .setTags(Arrays.asList("Awesome", "General"))
                .build();

        courseWithAllFields.getParts().addAll(Arrays.asList(awesome2, awesome3));

        System.out.println(courseWithAllFields.toString());
        for (Course course : courseWithAllFields.getParts()) {
            System.out.println(course.toString());
        }
    }
}
