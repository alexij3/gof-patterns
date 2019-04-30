package com.buzilov.patterns.structural.facade;

import com.buzilov.patterns.creational.builder.innerclass.Course;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CourseRepository {
    public static Map<Integer, Course> courses = new HashMap<>();

    static {
        Course course = new Course.CourseBuilder(1, "Name", "desc", new Date(), new Date()).setPrice(500d).build();
        courses.put(course.getId(), course);
    }
}
