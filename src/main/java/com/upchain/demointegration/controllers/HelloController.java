package com.upchain.demointegration.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        System.out.println("Test Print");

        return "This is a demo app to test dev tools integration.";
    }
}
