package com.springJPAImplementation.jpaimplementation.controller;

import com.springJPAImplementation.jpaimplementation.entity.Student;
import com.springJPAImplementation.jpaimplementation.service.SendDetailsService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpRequest;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentData {
    private SendDetailsService sendDetailsService;
    @PostMapping("/sendDetails")
    public ResponseEntity<?> sendDetails(@RequestBody Student student){
        System.out.println("Started sendDetails"+ student);
        Student sent_data = sendDetailsService.addDetailsToDb(student);
        return new ResponseEntity<>(sent_data, HttpStatus.OK);

    }
}
