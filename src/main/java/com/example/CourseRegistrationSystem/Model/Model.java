package com.example.CourseRegistrationSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Model {
    @Id
    private String CourseId;
    private String CourseName;
    private String Trainer;
    private int durationInWeeks;

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String courseId) {
        CourseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getTrainer() {
        return Trainer;
    }

    public void setTrainer(String trainer) {
        Trainer = trainer;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }
}
