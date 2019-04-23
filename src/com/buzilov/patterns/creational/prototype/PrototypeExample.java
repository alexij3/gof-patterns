package com.buzilov.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.Date;

public class PrototypeExample {
    public static void main(String[] args) {
        Course courseWithAllFields = new Course(2000, "Name", "Desc", 12, 10d);
        courseWithAllFields.setStartDate(new Date());
        courseWithAllFields.setEndDate(new Date());

        Course clone = new Course(courseWithAllFields);

        System.out.println("Course: \n" + courseWithAllFields.toString());
        System.out.println("Clone: \n" + clone.toString());
    }
}
