package com.example.simplewebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping("/")
    String return1(){
        return "Hello World";
}
}
