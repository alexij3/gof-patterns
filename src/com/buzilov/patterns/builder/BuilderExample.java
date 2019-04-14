package com.buzilov.patterns.builder;

import com.buzilov.patterns.builder.hierarchy.CheapCourseBuilder;
import com.buzilov.patterns.builder.hierarchy.ContentManager;
import com.buzilov.patterns.builder.hierarchy.CourseBuilder;
import com.buzilov.patterns.builder.hierarchy.ExpensiveCourseBuilder;
import com.buzilov.patterns.builder.innerclass.Course;

import java.util.Arrays;
import java.util.Date;

public class BuilderExample {
    public static void main(String[] args) {
        Course courseWithoutOptionalFields = new Course.CourseBuilder(
                1, "Awesome name", "Awesome description", new Date(), new Date()).build();

        System.out.println("[Course information without optional fields]");
        System.out.println(courseWithoutOptionalFields.toString() + "\n");

        Course courseWithAllFields = new Course.CourseBuilder(
                2, "Another name", "Another description", new Date(), new Date())
                .setAgeLimit(12)
                .setPrice(40d)
                .setTags(Arrays.asList("Awesome", "General"))
                .build();

        System.out.println("[Course information with optional fields]");
        System.out.println(courseWithAllFields.toString() + "\n");

        CourseBuilder expensiveCourseBuilder = new ExpensiveCourseBuilder();
        CourseBuilder cheapCourseBuilder = new CheapCourseBuilder();

        ContentManager expensiveCourseContentManager = new ContentManager(expensiveCourseBuilder);
        ContentManager cheapCourseContentManager = new ContentManager(cheapCourseBuilder);

        expensiveCourseContentManager.createCourse();
        cheapCourseContentManager.createCourse();

        com.buzilov.patterns.builder.hierarchy.Course expensiveCourse = expensiveCourseContentManager.getCourse();
        com.buzilov.patterns.builder.hierarchy.Course cheapCourse = cheapCourseContentManager.getCourse();

        System.out.println("[Expensive course information]");
        System.out.println(expensiveCourse.toString() + "\n");

        System.out.println("[Cheap course information]");
        System.out.println(cheapCourse.toString() + "\n");
    }
}
