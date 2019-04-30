package com.buzilov.patterns.structural.proxy.dao;

import com.buzilov.patterns.creational.factory.model.User;

public interface ICourseDAO {
    void sendCourseToArchive(Integer courseId, User user) throws Exception;
}
