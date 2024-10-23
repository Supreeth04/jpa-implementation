package com.springJPAImplementation.jpaimplementation.repository;


import com.springJPAImplementation.jpaimplementation.entity.Student;
import com.springJPAImplementation.jpaimplementation.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest


class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("Mr.So4@gmail.com")
                .firstName("Mr")
                .lastName("So4")
                .guardianName("Supreeth")
                .guardianEmail("supreeth@gmail.com")
                .getGuardianMobile("4567783090")
                .build();
        studentRepository.save(student);
    }


}