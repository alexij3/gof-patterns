package com.buzilov.patterns.structural.flyweight;

import java.util.HashSet;
import java.util.Set;

public class FlyweightExample {
    public static void main(String[] args) {
        Set<Course> courseList = new HashSet<>();

        CourseFactory.getCourse(1).ifPresent(courseList::add);
        CourseFactory.getCourse(2).ifPresent(courseList::add);
        CourseFactory.getCourse(3).ifPresent(courseList::add);

        for (Course course : courseList) {
            System.out.println(course.toString());
        }

        CourseFactory.getCourse(2).ifPresent(e -> System.out.println(e.toString()));
        CourseFactory.getCourse(4).ifPresent(e -> System.out.println(e.toString()));
    }
}
