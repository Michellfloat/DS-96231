package com.example.demo.dto;

import com.example.demo.model.EnderecoModel;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ClienteRequestDTO {
    @NotBlank(message = "O nome completo é obrigatório")
    @Size(min = 15, message = "O nome deve ter no mínimo 15 caracteres")
    @Size(max = 200, message = "O nome deve ter no máximo 200 caracteres")
    private String nome;

    

    @Email(message = "Deve ser inserido um E-mail válido!")
    private String email;

    @NotNull(message = "O Endereço é obrigatório")
    private EnderecoModel endereco;

    public ClienteRequestDTO() {
    }

    public ClienteRequestDTO(
            @NotBlank(message = "O nome completo é obrigatório") @Size(min = 15, message = "O nome deve ter no mínimo 15 caracteres") @Size(max = 200, message = "O nome deve ter no máximo 200 caracteres") String nome,
            @Email(message = "Deve ser inserido um E-mail válido!") String email,
            @NotNull(message = "O Endereço é obrigatório") EnderecoModel endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    

    
}
