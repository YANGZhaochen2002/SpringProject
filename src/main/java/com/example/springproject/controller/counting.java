package com.example.springproject.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class counting {
    public static int a=0;
    @RequestMapping ("/count")
    public String count(){
        a++;
        return "The number is: "+a;
    }

}
