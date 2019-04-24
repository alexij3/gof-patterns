package com.buzilov.patterns.structural.decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        Course course = new Course();
        course.setPrice(20d);
        ICourse discountCourse = new CourseWithDiscountDecorator(course);

        System.out.println("Course with discount: ");
        System.out.println(discountCourse.getPrice());
    }
}
