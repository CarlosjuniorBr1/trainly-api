package com.carlos.crud_spring.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.crud_spring.Model.Course;
import com.carlos.crud_spring.Repository.CourseRepository;

@RestController
@RequestMapping("/api/cursos")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }


    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll(); 
    }
}
