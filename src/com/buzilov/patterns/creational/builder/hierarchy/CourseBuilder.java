package com.buzilov.patterns.creational.builder.hierarchy;

public interface CourseBuilder {
    void buildId();
    void buildName();
    void buildDescription();
    void buildTags();
    void buildStartDate();
    void buildEndDate();
    void buildAgeLimit();
    void buildPrice();
    Course getCourse();
}
