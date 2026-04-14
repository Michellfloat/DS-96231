package com.example.atv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BemVindo {
    @GetMapping("/")
    public String message(){
        return "Bem vindo!!!";
    }

    @GetMapping("/dev")
    public String message_two(){
        return "Michell Silva Santos";
    }
}
