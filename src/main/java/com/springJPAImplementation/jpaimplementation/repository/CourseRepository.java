package com.springJPAImplementation.jpaimplementation.repository;

import com.springJPAImplementation.jpaimplementation.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepository extends JpaRepository<Course, Long> {
}
