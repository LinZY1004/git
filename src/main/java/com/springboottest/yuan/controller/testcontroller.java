package com.springboottest.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testcontroller {
    @GetMapping("/test")
    public String test(){
        System.out.println("hhhh");
        System.out.println("h22hhh66");
        System.out.println("hhh33333333333的点点滴滴d多多多多多多3h66");
        return "index.html";

    }
}
