package com.example.spring_basico.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class Welcome {
    //controllers, endpoints...//
@GetMapping("/")
public String mensagem() {
    return "Seja bem vindo!";
}

@GetMapping("/dev")
public String nomeDev() {
    return "Feito por:Michell(float)";
}

//recebendo enviando dados para o usuário


}
