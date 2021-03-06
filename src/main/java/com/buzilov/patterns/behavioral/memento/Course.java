package com.buzilov.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {
    private Integer id;
    private String name;
    private String description;
    private List<String> tags; // Optional field
    private Date startDate;
    private Date endDate;
    private Integer ageLimit; // Optional field
    private Double price; // Optional field

    public static class CourseBuilder{
        private Integer id;
        private String name;
        private String description;
        private List<String> tags;
        private Date startDate;
        private Date endDate;
        private Integer ageLimit;
        private Double price;

        public CourseBuilder(Integer id, String name, String description, Date startDate, Date endDate) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.startDate = startDate;
            this.endDate = endDate;
        }

        public CourseBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public CourseBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public CourseBuilder setTags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        public CourseBuilder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public CourseBuilder setEndDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public CourseBuilder setAgeLimit(Integer ageLimit) {
            this.ageLimit = ageLimit;
            return this;
        }

        public CourseBuilder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }

    private Course(CourseBuilder courseBuilder){
        this.id = courseBuilder.id;
        this.name = courseBuilder.name;
        this.description = courseBuilder.description;
        this.tags = courseBuilder.tags;
        this.startDate = courseBuilder.startDate;
        this.endDate = courseBuilder.endDate;
        this.ageLimit = courseBuilder.ageLimit;
        this.price = courseBuilder.price;
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

    public CourseMemento saveState() {
        return new CourseMemento(this);
    }

    public void loadState(CourseMemento courseState) {
        this.id = new Integer(courseState.getId());
        this.name = courseState.getName();
        this.description = courseState.getDescription();
        this.tags = new ArrayList<>(courseState.getTags());
        this.startDate = (Date) courseState.getStartDate().clone();
        this.endDate = (Date) courseState.getEndDate().clone();
        this.ageLimit = new Integer(courseState.getAgeLimit());
        this.price = new Double(courseState.getPrice());
    }

    @Override
    public String toString() {
        return "Course:\n" +
                "Id = " + id +
                "\nName='" + name + '\'' +
                "\nDescription='" + description + '\'' +
                "\nTags=" + tags +
                "\nStartDate=" + startDate +
                "\nEndDate=" + endDate +
                "\nAgeLimit=" + ageLimit +
                "\nPrice=" + price +
                "}\n";
    }
}
