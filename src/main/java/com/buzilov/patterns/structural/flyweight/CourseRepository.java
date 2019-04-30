package com.buzilov.patterns.structural.flyweight;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CourseRepository {
    private static Map<Integer, Course> courses = new HashMap<>();

    static {
        Course mathCourse = new Course.CourseBuilder(1, "Math", "Math", new Date(), new Date()).build();
        Course langCourse = new Course.CourseBuilder(2, "Lang", "Lang", new Date(), new Date()).build();
        Course programmingCourse = new Course.CourseBuilder(3, "Programming", "Programming", new Date(), new Date()).build();

        courses.put(mathCourse.getId(), mathCourse);
        courses.put(langCourse.getId(), langCourse);
        courses.put(programmingCourse.getId(), programmingCourse);
    }

    public static Course getCourse(Integer id) {
        return courses.get(id);
    }


}
