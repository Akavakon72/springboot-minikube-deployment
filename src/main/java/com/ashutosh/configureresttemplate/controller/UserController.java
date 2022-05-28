package com.ashutosh.configureresttemplate.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class UserController {

    @GetMapping("hello")
    public ResponseEntity getHello() {
        Random random = new Random();
        String result  = random.nextBoolean() ? "it's my day" : "next day will be mine";
        return new ResponseEntity<>(result,HttpStatus.OK);

    }
}