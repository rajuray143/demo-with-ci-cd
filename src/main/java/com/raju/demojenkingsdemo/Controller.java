package com.raju.demojenkingsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Controller {

    @GetMapping("/hello")
    public String getUserDetails(){
        return "hello raju kumar ray";
    }
    @GetMapping("/hi")
    public String hello(){
        return "hello raju kumar ray";
    }

}
