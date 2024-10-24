package com.springJPAImplementation.jpaimplementation.repository;


import com.springJPAImplementation.jpaimplementation.entity.StudentEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest


class StudentEntityRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void saveStudent(){
        StudentEntity studentEntity = StudentEntity.builder()
                .emailId("Mr.So4@gmail.com")
                .firstName("Mr")
                .lastName("So4")
                .guardianName("Supreeth")
                .guardianEmail("supreeth@gmail.com")
                .getGuardianMobile("4567783090")
                .build();
        studentRepository.save(studentEntity);
    }


}