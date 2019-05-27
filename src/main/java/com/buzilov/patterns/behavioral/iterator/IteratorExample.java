package com.buzilov.patterns.behavioral.iterator;

import com.buzilov.patterns.creational.builder.innerclass.Course;

public class IteratorExample {
    public static void main(String[] args) {
        CourseRepository courseRepository = new CourseRepository();
        Iterator<Course> iterator = courseRepository.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
