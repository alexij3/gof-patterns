package com.buzilov.patterns.structural.proxy.dao.impl;

import com.buzilov.patterns.creational.factory.model.Admin;
import com.buzilov.patterns.creational.factory.model.ContentManager;
import com.buzilov.patterns.creational.factory.model.User;
import com.buzilov.patterns.structural.proxy.dao.ICourseDAO;

public class CourseDAO implements ICourseDAO {

    @Override
    public void sendCourseToArchive(Integer courseId, User user) throws Exception {
        // Logic of retrieving database connection and generating query to send course to archive.
        if (user instanceof Admin || user instanceof ContentManager) {
            // Send course to archive.
            System.out.printf("Course with id %d has been sent to archive.\n", courseId);
        } else {
            throw new Exception("Access denied");
        }
    }
}
