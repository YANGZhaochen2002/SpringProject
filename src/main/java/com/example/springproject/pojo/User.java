package com.example.springproject.pojo;
import com.fasterxml.jackson.annotation.JsonFormat ;
import com.fasterxml.jackson.annotation.JsonIgnore ;
import com.fasterxml.jackson.annotation.JsonInclude ;

import java.util.ArrayList;
import java.util.Date ;
import java.util.List;

public class User {
    private String name;
    @JsonIgnore

    private String password;
    private Integer age;
    @JsonFormat (pattern = "yyyy-MM-dd hh:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date birthday;
    @JsonInclude (JsonInclude .Include .NON_NULL )
    private String desc;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password){
        this.password =password ;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public Date getBirthday (){
        return birthday ;
    }
    public void setBirthday(Date birthday){
        this.birthday =birthday ;
    }
    public User(String name,Integer age,String password ){
        this.name =name;
        this.age =age;
        this.password =password ;
    }
}
