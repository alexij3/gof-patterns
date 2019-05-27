package com.buzilov.patterns.behavioral.iterator;

import com.buzilov.patterns.creational.builder.innerclass.Course;

import java.util.Date;

public class CourseRepository implements Iterable{
    private Course[] courses = {new Course.CourseBuilder(1, "name 1", "desc 1", new Date(), new Date()).setPrice(100d).build(),
            new Course.CourseBuilder(2, "name 2", "desc 2", new Date(), new Date()).setPrice(150d).build(),
            new Course.CourseBuilder(3, "name 3", "desc 3", new Date(), new Date()).setPrice(75d).build(),
            new Course.CourseBuilder(4, "name 4", "desc 4", new Date(), new Date()).setPrice(120d).build(),
            new Course.CourseBuilder(5, "name 5", "desc 5", new Date(), new Date()).setPrice(50d).build()};


    @Override
    public Iterator getIterator() {
        return new ExpensiveCourseIterator();
    }

    private class ExpensiveCourseIterator implements Iterator<Course> {
        int index = 0;

        @Override
        public boolean hasNext() {
            for (int i = index; i < courses.length; i++) {
                if (courses[i].getPrice() >= 100d) {
                    return true;
                }
            }

            return false;
        }

        @Override
        public Course next() {
            if (hasNext()) {
                for (int i = index; i < courses.length; i++) {
                    if (courses[i].getPrice() >= 100d) {
                        index = i;
                        return courses[index++];
                    }
                }
            }

            return null;
        }
    }
}
