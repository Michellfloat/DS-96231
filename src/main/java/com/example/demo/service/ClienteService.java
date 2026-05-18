package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ClienteRequestDTO;
import com.example.demo.dto.ClienteResponseDTO;
import com.example.demo.model.ClienteModel;
import com.example.demo.repository.ClienteRepository;

import jakarta.transaction.Transactional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public ClienteModel salvarClientes(ClienteRequestDTO cliente){
        if (clienteRepository.findByEmail(cliente.getEmail()).isPresent()) {
            throw new RuntimeException("cliente já cadastrado!");
        }
        ClienteModel novCliente = new ClienteModel();
        novCliente.setNome(cliente.getNome());
        novCliente.setSexo(cliente.getSexo());
        novCliente.setEmail(cliente.getEmail());
        novCliente.setSenha(encoder.encode(cliente.getSenha()));
        novCliente.setIdade(cliente.getIdade());
        novCliente.setTelefone(cliente.getTelefone());

        return clienteRepository.save(novCliente);
    }

    public List<ClienteResponseDTO>listarClientes(){
        return clienteRepository.findAll().stream().map(c -> new ClienteResponseDTO(c.getNome(),c.getEmail(),c.getTelefone())).toList();
    }

    @Transactional
    public ClienteResponseDTO atualizarClientes(Long id, ClienteRequestDTO cliente){

        ClienteModel clienteExiste = clienteRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Este cliente não existe!"));
        
        clienteExiste.setNome(cliente.getNome());
        clienteExiste.setIdade(cliente.getIdade());
        clienteExiste.setEmail(cliente.getEmail());
        clienteExiste.setSexo(cliente.getSexo());
        clienteExiste.setSenha(cliente.getSenha());
        clienteExiste.setTelefone(cliente.getTelefone());

        ClienteModel atualizado = clienteRepository.save(clienteExiste);

        return new ClienteResponseDTO(atualizado.getNome(),atualizado.getEmail(),atualizado.getTelefone());
    }

    @Transactional
    public void deletarClientes(Long id){
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("Este cliente não existe!");
        }
        clienteRepository.deleteById(id);
    }
}
