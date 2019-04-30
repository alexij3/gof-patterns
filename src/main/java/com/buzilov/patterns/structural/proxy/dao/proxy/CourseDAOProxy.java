package com.buzilov.patterns.structural.proxy.dao.proxy;

import com.buzilov.patterns.creational.factory.model.Admin;
import com.buzilov.patterns.creational.factory.model.ContentManager;
import com.buzilov.patterns.creational.factory.model.User;
import com.buzilov.patterns.structural.proxy.dao.ICourseDAO;
import com.buzilov.patterns.structural.proxy.dao.impl.CourseDAO;

public class CourseDAOProxy implements ICourseDAO {
    private CourseDAO courseDAO;

    public CourseDAOProxy() {
        courseDAO = new CourseDAO();
    }

    @Override
    public void sendCourseToArchive(Integer courseId, User user) throws Exception {
        if (user instanceof Admin || user instanceof ContentManager) {
            courseDAO.sendCourseToArchive(courseId, user);
        } else {
            throw new Exception("Access denied");
        }
    }
}
