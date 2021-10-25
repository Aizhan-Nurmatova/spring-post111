package com.peaksoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

//    localhost:8080/
    @GetMapping
    public String mainController(){
        return "main-page";
    }
}
