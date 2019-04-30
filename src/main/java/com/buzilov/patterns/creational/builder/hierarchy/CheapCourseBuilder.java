package com.buzilov.patterns.creational.builder.hierarchy;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class CheapCourseBuilder implements CourseBuilder {
    private Course course;

    public CheapCourseBuilder() {
        course = new Course();
    }

    @Override
    public void buildId() {
        course.setId(new Random().nextInt(40) + 15);
    }

    @Override
    public void buildName() {
        course.setName("Cheap course name");
    }

    @Override
    public void buildDescription() {
        course.setDescription("Cheap course description");
    }

    @Override
    public void buildTags() {
        course.setTags(Arrays.asList("Cheap", "Very cheap"));
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
        course.setPrice(1d);
    }

    public Course getCourse(){
        return course;
    }
}
