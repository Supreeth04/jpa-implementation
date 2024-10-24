package com.springJPAImplementation.jpaimplementation.controller;

import com.springJPAImplementation.jpaimplementation.entity.StudentEntity;
import com.springJPAImplementation.jpaimplementation.repository.StudentRepository;
import com.springJPAImplementation.jpaimplementation.service.SendDetailsService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpRequest;
//import org.springframework.beans.factory.annotation.Autowired;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentData {

    @Autowired
    private SendDetailsService sendDetailsService;
    @PostMapping("/sendDetails")
    public ResponseEntity<?> sendDetails(@RequestBody StudentEntity student) throws Exception {
        System.out.println("Started sendDetails"+ student);
            ResponseEntity sent_data = sendDetailsService.addDetailsToDb(student);
//            if (sent_data.getStatusCode()!= HttpStatus.OK){
//                return new ResponseEntity<>(sent_data, HttpStatus.OK)
//            }
        return new ResponseEntity<>(sent_data, HttpStatus.OK);

    }
    @GetMapping("/getAllDetails")
    public List<?> getAllDetails() throws Exception{
        System.out.println("In getAllDetails Controller :)");
        List stundentsList = sendDetailsService.showDeatils();
        return stundentsList;
    }

}
