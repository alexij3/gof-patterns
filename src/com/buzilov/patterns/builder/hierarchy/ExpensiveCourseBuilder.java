package com.buzilov.patterns.builder.hierarchy;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class ExpensiveCourseBuilder implements CourseBuilder {
    private Course course;

    public ExpensiveCourseBuilder() {
        course = new Course();
    }

    @Override
    public void buildId() {
        course.setId(new Random().nextInt(40) + 2);
    }

    @Override
    public void buildName() {
        course.setName("Expensive course name");
    }

    @Override
    public void buildDescription() {
        course.setDescription("Expensive course description");
    }

    @Override
    public void buildTags() {
        course.setTags(Arrays.asList("Expensive", "Very expensive"));
    }

    @Override
    public void buildStartDate() {
        course.setStartDate(new Date());
    }

    @Override
    public void buildEndDate() {
        course.setEndDate(new Date());
    }

    @Override
    public void buildAgeLimit() {
        course.setAgeLimit(12);
    }

    @Override
    public void buildPrice() {
        course.setPrice(10000d);
    }

    public Course getCourse(){
        return course;
    }
}
