package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ColaboradorRequestDTO {
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @Email(message = "Deve ser inserido um E-mail válido!")
    private String email;

    @NotBlank(message = "O telefone é obrigatório!")
    @Size(min = 14, max = 14, message = "Por favor insira 14 caracteres")
    private String telefone;

    @NotNull(message = "O cargo é obrigatório")
    private String cargo;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 6, max = 20, message = "A senha deve ter entre 6 a 20 caracteres")
    private String senha;

    public ColaboradorRequestDTO() {
    }

    public ColaboradorRequestDTO(@NotBlank(message = "O nome é obrigatório") String nome,
            @Email(message = "Deve ser inserido um E-mail válido!") String email,
            @NotBlank(message = "O telefone é obrigatório!") @Size(min = 14, max = 14, message = "Por favor insira 14 caracteres") String telefone,
            @NotNull(message = "O cargo é obrigatório") String cargo,
            @NotBlank(message = "A senha é obrigatória") @Size(min = 6, max = 20, message = "A senha deve ter entre 6 a 20 caracteres") String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cargo = cargo;
        this.senha = senha;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
