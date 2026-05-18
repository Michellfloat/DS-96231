package com.example.demo.dto;

import com.example.demo.model.enums.Sexo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ClienteRequestDTO {
    @NotBlank(message = "O nome completo é obrigatório")
    @Size(min = 15, message = "O nome deve ter no mínimo 15 caracteres")
    @Size(max = 200, message = "O nome deve ter no máximo 200 caracteres")
    private String nome;

    @NotBlank(message = "A idade é obrigatória")
    @Size(min = 1, message = "a idade deve ter no mínimo 1 caractere")
    private String idade;

    @Email(message = "Deve ser inserido um E-mail válido!")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 6, max = 20, message = "A senha deve ter entre 6 a 20 caracteres")
    private String senha;

    @NotNull(message = "Apresentar o Sexo")
    private Sexo sexo;

    @NotBlank(message = "O telefone é obrigatório!")
    @Size(min = 14,max = 14, message = "Por favor insira 14 caracteres")
    private String telefone;

    public ClienteRequestDTO() {
    }

    public ClienteRequestDTO(
            @NotBlank(message = "O nome completo é obrigatório") @Size(min = 15, message = "O nome deve ter no mínimo 15 caracteres") @Size(max = 200, message = "O nome deve ter no máximo 200 caracteres") String nome,
            @NotBlank(message = "A idade é obrigatória") @Size(min = 1, message = "a idade deve ter no mínimo 1 caractere") String idade,
            @Email(message = "Deve ser inserido um E-mail válido!") String email,
            @NotBlank(message = "A senha é obrigatória") @Size(min = 6, max = 20, message = "A senha deve ter entre 6 a 20 caracteres") String senha,
            @NotNull(message = "Apresentar o Sexo") Sexo sexo,
            @NotBlank(message = "O telefone é obrigatório!") @Size(min = 14, max = 14, message = "Por favor insira 14 caracteres") String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}
