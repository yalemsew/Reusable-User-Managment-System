package org.example.userprofilems.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home") //http://localhost.8080/home
public class MyController {

    @GetMapping
    public String home(){
        return "Hello World";
    }
    @GetMapping("/{name}") //path variable
    public String homeWithName(@PathVariable String name){
        return "Hello World " + name;
    }
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @GetMapping("/say-hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello World");
    }

}
