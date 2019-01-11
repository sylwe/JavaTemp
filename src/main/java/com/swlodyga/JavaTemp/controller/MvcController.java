package com.swlodyga.JavaTemp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController {

    @RequestMapping("/")
    public String hello(){
        return "Hello Word";
    }

    @RequestMapping("/user*")
    public String user(){
        return "User id";
    }
    @RequestMapping("/admin*")
    public String admin(){
        return "Admin id";
    }
}
