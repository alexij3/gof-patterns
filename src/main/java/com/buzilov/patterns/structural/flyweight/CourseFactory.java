package com.buzilov.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CourseFactory {
    private static Map<Integer, Course> coursesCache = new HashMap<>();

    public static Optional<Course> getCourse(Integer courseId) {
        Course course = coursesCache.get(courseId);

        if (course == null) {
            System.out.printf("Could not find the course with id %d in the cache. Trying to retrieve it from DB...%n", courseId);
            // Retrieve course from the database.
            course = CourseRepository.getCourse(courseId);
            if (course != null) {
                System.out.printf("Successfully retrieved the course with id %d from the database.%n", courseId);
                coursesCache.put(courseId, course);
                System.out.printf("Added course with id %d to the cache.%n", courseId);
            } else {
                System.out.printf("Could not find the course with id %d in the database.", courseId);
            }
        } else {
            System.out.printf("Successfully retrieved the course with id %d from the cache.%n", courseId);
        }

        return Optional.ofNullable(course);
    }


}
