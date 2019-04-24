package com.buzilov.patterns.structural.proxy;

import com.buzilov.patterns.creational.factory.factories.UserFactory;
import com.buzilov.patterns.creational.factory.model.User;
import com.buzilov.patterns.structural.proxy.dao.ICourseDAO;
import com.buzilov.patterns.structural.proxy.dao.proxy.CourseDAOProxy;

public class ProxyExample {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        User user = userFactory.getUser(User.UserType.SIMPLE_USER, "user", "12345a");

        Course course = new Course();
        course.setId(1);

        ICourseDAO courseDAO = new CourseDAOProxy();

        User admin = userFactory.getUser(User.UserType.ADMIN, "admin", "admin");

        try {
            courseDAO.sendCourseToArchive(course.getId(), admin);
        } catch (Exception e) {
            System.out.printf("Couldn't send course with id %d to archive: " + e.getMessage(), course.getId());
        }

        try {
            courseDAO.sendCourseToArchive(course.getId(), user);
        } catch (Exception e) {
            System.out.printf("Couldn't send course with id %d to archive: " + e.getMessage(), course.getId());
        }
    }
}
