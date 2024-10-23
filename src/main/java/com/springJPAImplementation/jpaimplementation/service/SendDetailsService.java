package com.springJPAImplementation.jpaimplementation.service;

import com.springJPAImplementation.jpaimplementation.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SendDetailsService {
    public Student addDetailsToDb(Student student){
        System.out.println("In addDetailsToDb");
        log.info("Enter details: "+student);
        return student;
    }
}
