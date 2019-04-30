package com.buzilov.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {
    private Integer id;
    private String name;
    private String description;
    private List<String> tags = new ArrayList<>(); // Optional field
    private Date startDate;
    private Date endDate;
    private Integer ageLimit; // Optional field
    private Double price; // Optional field

    public Course() {
    }

    public Course(Course courseToCopy) {
        this.id = new Integer(courseToCopy.id);
        this.name = new String(courseToCopy.name);
        this.description = new String(courseToCopy.description);
        this.tags = new ArrayList<>(tags);
        this.startDate = new Date(courseToCopy.startDate.getTime());
        this.endDate = new Date(courseToCopy.endDate.getTime());
        this.ageLimit = new Integer(courseToCopy.ageLimit);
        this.price = courseToCopy.price;
    }

    public Course(Integer id, String name, String description, Integer ageLimit, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ageLimit = ageLimit;
        this.price = price;
    }

    public Course(Integer id, String name, String description, List<String> tags, Date startDate, Date endDate, Integer ageLimit, Double price) {
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ",\n name='" + name + '\'' +
                ",\n description='" + description + '\'' +
                ",\n tags=" + tags +
                ",\n startDate=" + startDate +
                ",\n endDate=" + endDate +
                ",\n ageLimit=" + ageLimit +
                ",\n price=" + price +
                '}';
    }
}
