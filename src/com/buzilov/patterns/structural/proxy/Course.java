package com.buzilov.patterns.structural.proxy;

import com.buzilov.patterns.structural.decorator.ICourse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course implements ICourse{
    private Integer id;
    private String name;
    private String description;
    private List<String> tags; // Optional field
    private Date startDate;
    private Date endDate;
    private Integer ageLimit; // Optional field
    private Double price; // Optional field
    private List<Course> parts = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Course> getParts() {
        return parts;
    }

    public void setParts(List<Course> parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", ageLimit=" + ageLimit +
                ", price=" + price +
                '}';
    }
}
