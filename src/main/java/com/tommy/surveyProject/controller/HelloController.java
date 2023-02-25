package com.tommy.surveyProject.controller;


import com.tommy.surveyProject.config.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<Message> hello(){
        HttpHeaders httpHeader = new HttpHeaders();
        Message message = Message.builder()
                .statusCode(200)
                .message("성공")
                .data("hello")
                .build();
        return new ResponseEntity<>(message, httpHeader, HttpStatus.OK);
    }

}
