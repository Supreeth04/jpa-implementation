package com.springJPAImplementation.jpaimplementation.service;

import com.springJPAImplementation.jpaimplementation.entity.StudentEntity;
import com.springJPAImplementation.jpaimplementation.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SendDetailsService {
    @Autowired
    StudentRepository studentRepository;
    public ResponseEntity<?> addDetailsToDb(StudentEntity student) throws Exception {
        try {
            System.out.println("In addDetailsToDb");
            log.info("Enter details: " + student);
            StudentEntity savedData = studentRepository.save(student);
            return new ResponseEntity<>("Invalid fields in student:"+ student, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }
    public List<?> showDeatils() throws Exception{
        try{
            List<?> details = studentRepository.findAll();
            return details;
        } catch (Exception e){
            return (List<?>) e;
        }
    }
}
