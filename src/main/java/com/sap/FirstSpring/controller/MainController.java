package com.sap.FirstSpring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "Home_Page";
    }

    @RequestMapping("/myself")
    public String myName() {
        return "Amit_Raj123";
    }
}
