package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellogcontroller {

    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }
}
