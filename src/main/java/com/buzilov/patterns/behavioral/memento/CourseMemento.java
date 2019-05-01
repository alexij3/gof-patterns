package com.buzilov.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Class that stores a certain state of Course object.
public class CourseMemento {
    private final Integer id;
    private final String name;
    private final String description;
    private final List<String> tags; // Optional field
    private final Date startDate;
    private final Date endDate;
    private final Integer ageLimit; // Optional field
    private final Double price; // Optional field

    public CourseMemento(Course course) {
        this.id = new Integer(course.getId());
        this.name = course.getName();
        this.description = course.getDescription();
        this.tags = new ArrayList<>(course.getTags());
        this.startDate = (Date) course.getStartDate().clone();
        this.endDate = (Date) course.getEndDate().clone();
        this.ageLimit = new Integer(course.getAgeLimit());
        this.price = new Double(course.getPrice());
    }

    public CourseMemento(Integer id, String name, String description, List<String> tags, Date startDate, Date endDate, Integer ageLimit, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.startDate = startDate;
        this.endDate = endDate;
        this.ageLimit = ageLimit;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Integer getAgeLimit() {
        return ageLimit;
    }

    public Double getPrice() {
        return price;
    }
}
