package org.example.userprofilems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home") //http://localhost.8080/home
public class MyController {

    @GetMapping
    public String home(){
        return "Hello World";
    }
}
