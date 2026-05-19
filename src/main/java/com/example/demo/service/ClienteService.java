package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ClienteRequestDTO;
import com.example.demo.dto.ClienteResponseDTO;
import com.example.demo.model.ClienteModel;
import com.example.demo.model.EnderecoModel;
import com.example.demo.repository.ClienteRepository;

import jakarta.transaction.Transactional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    

    public ClienteModel salvarClientes(ClienteRequestDTO cliente){
        if (clienteRepository.findByEmail(cliente.getEmail()).isPresent()) {
            throw new RuntimeException("cliente já cadastrado!");
        }
        ClienteModel novCliente = new ClienteModel();
        novCliente.setNome(cliente.getNome());
        novCliente.setEndereco(cliente.getEndereco());
        novCliente.setEmail(cliente.getEmail());
        

        return clienteRepository.save(novCliente);
    }

    public List<ClienteResponseDTO>listarClientes(){
        return clienteRepository.findAll().stream().map(c -> new ClienteResponseDTO(c.getNome(),c.getEmail(),c.getEndereco())).toList();
    }

    @Transactional
    public ClienteResponseDTO atualizarClientes(Long id, ClienteRequestDTO cliente){
        ClienteModel clienteDadosNovos = new ClienteModel();
        ClienteModel clienteExiste = clienteRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Este cliente não existe!"));
        
        clienteExiste.setNome(cliente.getNome());
        clienteExiste.setEmail(cliente.getEmail());
        if (clienteExiste.getEndereco() != null && clienteDadosNovos.getEndereco() != null) {
        EnderecoModel enderecoExistente = clienteExiste.getEndereco();
        EnderecoModel env = clienteDadosNovos.getEndereco();
        
        enderecoExistente.setCep(env.getCep());
        enderecoExistente.setLogradouro(env.getLogradouro());
        enderecoExistente.setNumero(env.getNumero());
        enderecoExistente.setCidade(env.getCidade());
        enderecoExistente.setUf(env.getUf());
    }

        ClienteModel atualizado = clienteRepository.save(clienteExiste);

        return new ClienteResponseDTO(atualizado.getNome(),atualizado.getEmail(),atualizado.getEndereco());
    }

    @Transactional
    public void deletarClientes(Long id){
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("Este cliente não existe!");
        }
        clienteRepository.deleteById(id);
    }
}
