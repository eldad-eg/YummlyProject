
package com.example.yummlyteam.app.model;

import java.util.List;

public class Attributes {

    private List<String> course = null;
    private List<String> cuisine = null;
    private List<String> holiday = null;

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public List<String> getCuisine() {
        return cuisine;
    }

    public void setCuisine(List<String> cuisine) {
        this.cuisine = cuisine;
    }

    public List<String> getHoliday() {
        return holiday;
    }

    public void setHoliday(List<String> holiday) {
        this.holiday = holiday;
    }

}
