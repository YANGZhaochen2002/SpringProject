package com.example.springproject.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping ("/hello")
    public String hello(String name){
        return "Hello"+name;
    }
}
