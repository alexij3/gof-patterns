package com.buzilov.patterns.behavioral.memento;

import java.util.Arrays;
import java.util.Date;

public class MementoExample {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder(1, "First course", "First description", new Date(), new Date())
                                    .setAgeLimit(10)
                                    .setPrice(100d)
                                    .setTags(Arrays.asList("General", "Health"))
                                    .build();

        CourseCaretaker courseCaretaker = new CourseCaretaker();
        System.out.println(course);
        System.out.printf("Saving the state of course with id %d...%n", course.getId());
        courseCaretaker.saveState("First state", new CourseMemento(course));

        System.out.printf("Changing course name from %s to %s and its price from %f to %f.%n", course.getName(), "First super course", course.getPrice(), 125.0);
        course.setName("First super course");
        course.setPrice(125d);
        System.out.println(course);
        System.out.printf("Saving the state of course with id %d...%n", course.getId());
        courseCaretaker.saveState("Second state", new CourseMemento(course));

        System.out.println(course);
        System.out.printf("Changing course name from %s to %s.%n", course.getName(), "First ultra mega course");
        course.setName("First ultra mega course");
        System.out.println(course);
        System.out.printf("Reverting course state to First state...%n");

        if (courseCaretaker.getState("First state").isPresent()) {
            course.loadState(courseCaretaker.getState("First state").get());
            System.out.println(course);
        } else {
            System.out.printf("Could not find the state with name '%s'%n", "First state");
        }
    }
}
