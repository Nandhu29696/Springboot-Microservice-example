package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallbackMethod(){
        return "user service is taking longer the expected."+"Please try again later..";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallbackMethod(){
        return "department service is taking longer the expected."+"Please try again later..";
    }
}
