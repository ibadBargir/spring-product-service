package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class controller {
  
    @GetMapping("/ibad")
    public String home() {
        return "<h12 style = 'color: green; font-size:40px;'>"+
        "Welcome to Spring Boot Application made By Ibad Bargir" +
    "</h12>";
}


}