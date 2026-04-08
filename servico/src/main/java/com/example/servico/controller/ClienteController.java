package com.example.servico.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servico.model.ClienteModel;
import com.example.servico.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired

    private ClienteService clienteService;

    @GetMapping
    public List<ClienteModel>listar(){
        return clienteService.listarClientes();
    }

    @PostMapping
    public ResponseEntity<Map<Object, String>>salvar(@RequestBody ClienteModel cliente){
        clienteService.salvarCliente(cliente);
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(Map.of("mensagem", "Cliente cadastrado com sucesso!"));
            /*Map=tipo de classe padrão que serve como forma de representar o JSON em Java */
    }
}
