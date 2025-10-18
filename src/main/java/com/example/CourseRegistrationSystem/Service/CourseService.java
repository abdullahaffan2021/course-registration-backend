package com.example.CourseRegistrationSystem.Service;

import com.example.CourseRegistrationSystem.Model.Courseregistry;
import com.example.CourseRegistrationSystem.Model.Model;
import com.example.CourseRegistrationSystem.Repository.courseRepository;
import com.example.CourseRegistrationSystem.Repository.courseregistryrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
@Service
public class CourseService {
    @Autowired
    courseRepository repository;
    @Autowired
    courseregistryrepo courseregistryrepo;
    public List<Model> availableCourse() {
       return repository.findAll();
    }
    public List<Courseregistry> enrolledcourses() {
        return courseregistryrepo.findAll();
    }
    public void registercourses(String name,String emailid,String courseName){
        Courseregistry object=new Courseregistry(name,emailid,courseName);
        courseregistryrepo.save(object);
    }
}
