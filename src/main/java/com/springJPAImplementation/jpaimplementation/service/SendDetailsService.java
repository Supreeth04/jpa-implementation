package com.springJPAImplementation.jpaimplementation.service;

import com.springJPAImplementation.jpaimplementation.entity.StudentEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SendDetailsService {
    public ResponseEntity<?> addDetailsToDb(StudentEntity student) throws Exception {
        try {
            System.out.println("In addDetailsToDb");
            log.info("Enter details: " + student);
            return new ResponseEntity<>("Invalid fields in student:"+ student, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(400, HttpStatus.BAD_REQUEST);
        }
    }
}
