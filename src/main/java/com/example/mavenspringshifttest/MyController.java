package com.example.mavenspringshifttest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class MyController {
    @GetMapping("/")
    public String hello() {
        System.out.println("squash me");
        return "Hello OpenShift!";
    }
}
