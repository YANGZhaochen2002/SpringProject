package com.example.springproject.controller;
import com.example.springproject.pojo.User;

import org.springframework.stereotype.Controller ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date ;
import java.util.List;

@Controller
@RestController
public class UserController {
    List<User> storage=new ArrayList<>() ;
    @RequestMapping ("/sign_up")
    @ResponseBody
    public String setUser(String name,String password,int age){
        User A=new User(name,age,password );

        A.setBirthday(new Date());
        for(User a:storage ) {
            if (a.getName().equals(name) && a.getPassword().equals(password)) {
                return "You have already sign up!";
            }
        }
        storage .add(A);

        return "Your name: "+name+"     Your age: "+age+"      The User have been signed up successfully";
    }
    @RequestMapping ("/log_in")
    @ResponseBody
    public String log_in(String name,String password){
        for(User a:storage ){
            if(a.getName() .equals(name)&&a.getPassword() .equals(password ) ){
                return "You have been log in successfully !";
            }else if(a.getName() .equals(name) ){
                return "password is wrong";
            }
        }
        return "Please sign up first";
    }



}
