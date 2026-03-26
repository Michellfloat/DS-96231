package com.example.spring_basico.controller;

import java.util.List;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_basico.models.UsuarioModel;
import com.example.spring_basico.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    //Consultar todos os usuários.
    @GetMapping
    public List<UsuarioModel> listarTodos(){
        return usuarioRepository.findAll();
    }
    //Criar um novo usuário.
    // @PostMapping é uma anotação que indica que este método deve ser mapeado para uma requisição HTTP POST. Isso significa que ele responderá a requisições feitas para o caminho "/usuarios" usando o método POST, geralmente para criar um novo recurso (neste caso, um novo usuário).
    // @RequestBody é uma anotação que indica que o parâmetro do método deve ser preenchido com o corpo da requisição HTTP. Isso significa que os dados enviados na requisição (geralmente em formato JSON) serão convertidos para um objeto do tipo UsuarioModel e passados como argumento para o método salvar.
    @PostMapping
    public ResponseEntity<UsuarioModel> salvar(@RequestBody UsuarioModel usuario){
        usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
        // ResponseEntity é uma classe do Spring Framework que representa a resposta HTTP completa, incluindo o status code, os headers e o corpo da resposta. No exemplo, ResponseEntity.status(HttpStatus.CREATED) define o status code da resposta como 201 Created, indicando que um novo recurso foi criado com sucesso. O método body(usuario) define o corpo da resposta como o objeto usuario que foi salvo no banco de dados. Assim, quando este método for chamado, ele retornará uma resposta HTTP com status 201 e o usuário criado no corpo da resposta.
        // HttpStatus.CREATED é um status code HTTP que indica que um novo recurso foi criado com sucesso. Ele é usado para indicar que a requisição POST para criar um novo usuário foi bem-sucedida e que o recurso correspondente (o usuário criado) foi adicionado ao banco de dados.
        
    }
}


