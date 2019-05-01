package com.buzilov.patterns.behavioral.chain.model;

import java.util.Date;
import java.util.List;

public class Course {
    private final Integer id;
    private final String name;
    private final String description;
    private final List<String> tags; // Optional field
    private final Date startDate;
    private final Date endDate;
    private final Integer ageLimit; // Optional field
    private final Double price; // Optional field
    private final User author;

    public static class CourseBuilder{
        private Integer id;
        private String name;
        private String description;
        private List<String> tags;
        private Date startDate;
        private Date endDate;
        private Integer ageLimit;
        private Double price;
        private User author;

        public CourseBuilder(Integer id, String name, String description, Date startDate, Date endDate, User author) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.startDate = startDate;
            this.endDate = endDate;
            this.author = author;
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
        this.author = courseBuilder.author;
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

    public User getAuthor() {
        return author;
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
