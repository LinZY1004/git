package com.springboottest.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testcontroller {
    @GetMapping("/test")
    public String test(){
        System.out.println("hhhh");
        System.out.println("h22hhh66");
        System.out.println("hhh3333333333333h66");
        System.out.println("hhhh66");
        System.out.println("hhhh66");
        System.out.println("hhh2343h66");
        return "index.html";

    }
}
