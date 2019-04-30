package com.buzilov.patterns.structural.facade.service;

import com.buzilov.patterns.creational.builder.innerclass.Course;

public class PaymentService implements IPaymentService{
    @Override
    public void pay(Course course) {
        System.out.printf("Trying to pay for course with id %d%n", course.getId());
    }
}
