package com.example.demo.dto;

import com.example.demo.model.EnderecoModel;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class FuncionarioRequestDTO {
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "A matrícula é obrigatória")
    @Size(min = 5, max = 15, message = "A matrícula deve conter entre 5 e 15 caracteres")
    private String matricula;

    @NotBlank(message = "A data de nascimento é obrigatória")
    @Size(min = 10, max = 10, message = "A data de nascimento deve estar no formato dd/MM/yyyy")
    private String dataNascimento;

    @NotNull(message = "O salário é obrigatório")
    private Double salario;

    @Email(message = "O email é obrigatório e deve ser válido")
    private String email;

    @NotNull(message = "O Endereço é obrigatório")
    @Size(min = 8, max = 8, message = "O CEP deve conter exatamente 8 caracteres")
    private EnderecoModel endereco;

    public FuncionarioRequestDTO() {
    }

    public FuncionarioRequestDTO(@NotBlank(message = "O nome é obrigatório") String nome,
            @NotBlank(message = "A matrícula é obrigatória") @Size(min = 5, max = 15, message = "A matrícula deve conter entre 5 e 15 caracteres") String matricula,
            @NotBlank(message = "A data de nascimento é obrigatória") @Size(min = 10, max = 10, message = "A data de nascimento deve estar no formato dd/MM/yyyy") String dataNascimento,
            @NotNull(message = "O salário é obrigatório") Double salario,
            @Email(message = "O email é obrigatório e deve ser válido") String email,
            @NotBlank(message = "O Endereço é obrigatório") @Size(min = 8, max = 8, message = "O CEP deve conter exatamente 8 caracteres") EnderecoModel endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
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
