package com.ashutosh.springbootminikubedeployment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public ResponseEntity<String> getHelloMessage() {
        String message = "Welcome to application deployed in Minikube !!";
        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
}
