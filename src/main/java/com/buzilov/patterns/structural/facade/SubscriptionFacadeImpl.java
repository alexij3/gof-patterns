package com.buzilov.patterns.structural.facade;

import com.buzilov.patterns.creational.builder.innerclass.Course;
import com.buzilov.patterns.structural.facade.service.IPaymentService;
import com.buzilov.patterns.structural.facade.service.PaymentService;

public class SubscriptionFacadeImpl implements SubscriptionFacade{
    private IPaymentService paymentService = new PaymentService();

    @Override
    public void subscribe(Integer courseId) {
        System.out.printf("Subscribing user %s for course with id %d%n", SecurityContext.getCurrentUser().getUsername(), courseId);
        Course course = CourseRepository.courses.get(courseId);
        paymentService.pay(course);
    }
}
