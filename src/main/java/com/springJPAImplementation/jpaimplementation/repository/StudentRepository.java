package com.springJPAImplementation.jpaimplementation.repository;

import com.springJPAImplementation.jpaimplementation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
        }
