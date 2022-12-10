package com.reviewpoint.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/get-started")
    public String userLogin(){
        return "userLogin";
    }

    @GetMapping("/home")
    public String home(){
        return "index";
    }
}
