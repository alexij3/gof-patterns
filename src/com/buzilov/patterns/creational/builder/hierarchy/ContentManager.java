package com.buzilov.patterns.creational.builder.hierarchy;

public class ContentManager {
    private CourseBuilder builder;

    public ContentManager(CourseBuilder builder) {
        this.builder = builder;
    }

    public void createCourse(){
        builder.buildId();
        builder.buildName();
        builder.buildDescription();
        builder.buildStartDate();
        builder.buildEndDate();
        builder.buildAgeLimit();
        builder.buildTags();
        builder.buildPrice();
    }

    public Course getCourse(){
        return builder.getCourse();
    }
}
