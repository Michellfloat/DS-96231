package com.example.servico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.servico.model.ClienteModel;
import com.example.servico.repository.ClienteRepository;

@Service
public class ClienteService {
@Autowired

private ClienteRepository clienteRepository;

public List<ClienteModel>listarClientes(){
    return clienteRepository.findAll();
}

public ClienteModel salvarCliente(ClienteModel cliente){
    /*Verifica se o cliente não está cadastrado no banco de dados
    antes de salvar */
    if (clienteRepository.findByEmail(cliente.getEmail()).isPresent()) {
        throw new IllegalArgumentException("Cliente já está cadastrado!");
        
    }
    return clienteRepository.save(cliente);
}
}
