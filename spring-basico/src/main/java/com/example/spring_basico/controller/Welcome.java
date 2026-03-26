package com.example.spring_basico.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



// @RestController é uma anotação que indica que esta classe é um controlador REST, ou seja, ela é responsável por lidar com as requisições HTTP e retornar respostas. Ela combina as anotações @Controller e @ResponseBody, o que significa que os métodos desta classe retornarão diretamente os dados como resposta, em vez de renderizar uma visão (view).
@RestController
public class Welcome {
    //controllers, endpoints...////métodos que respondem as requisições do usuário
@GetMapping("/")
public String mensagem() {
    return "Seja bem vindo!";
}
// @GetMapping é uma anotação que indica que este método deve ser mapeado para uma requisição HTTP GET. O valor entre parênteses ("/") especifica o caminho da URL para o qual este método responderá. Neste caso, ele responderá a requisições feitas para a raiz do aplicativo (http://localhost:8080/).
@GetMapping("/dev")
public String nomeDev() {
    return "Feito por:Michell(float)";
}

//recebendo enviando dados para o usuário


}
