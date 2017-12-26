package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController
{
    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }
    @RequestMapping("/index")
    public String sayHelloWorld(){
        return "helloWorld";
    }

}
