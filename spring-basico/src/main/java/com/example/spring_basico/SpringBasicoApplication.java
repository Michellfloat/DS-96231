package com.example.spring_basico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication é uma anotação que indica que esta classe é a classe principal de uma aplicação Spring Boot. Ela combina três anotações: @Configuration, @EnableAutoConfiguration e @ComponentScan. Isso significa que a classe é usada para configurar a aplicação, habilitar a configuração automática do Spring Boot e escanear os componentes na mesma base de pacotes para encontrar beans e controladores.
@SpringBootApplication
public class SpringBasicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicoApplication.class, args);
	}

}
