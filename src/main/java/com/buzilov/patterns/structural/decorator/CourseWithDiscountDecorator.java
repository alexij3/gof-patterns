package com.buzilov.patterns.structural.decorator;

public class CourseWithDiscountDecorator implements ICourse {
    private ICourse course;
    private Double discount = 0.5d;

    public CourseWithDiscountDecorator(ICourse course) {
        this.course = course;
    }

    @Override
    public Double getPrice() {
        return course.getPrice() - (course.getPrice() * discount);
    }
}
