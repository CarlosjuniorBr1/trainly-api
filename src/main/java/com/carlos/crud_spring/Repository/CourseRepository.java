package com.carlos.crud_spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.crud_spring.Model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
