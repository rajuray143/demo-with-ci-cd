package com.raju.demojenkingsdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Controller {

    public String getUserDetails(){
        return "hello raju";
    }
}
