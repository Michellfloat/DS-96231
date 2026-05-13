package com.example.atvapi.dto;

import com.example.atvapi.model.enums.Area;
import com.example.atvapi.model.enums.Sexo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProfessorRequestDTO {
    @NotBlank(message = "O nome é obrigatório!!!")
    @Size(min = 15, message = "O nome completo deve ter no mínimo 15 caracteres")
    private String nome;

    @Email(message = "Deve ser inserido um email válido!!!")
    private String email;

    @NotBlank(message = "A idade é obrigatória!!!")
    @Size(min = 1, message = "Você deve ter no mínimo 1 ano de idade.")
    private String idade;

    @NotBlank(message = "A CNDB(CPF) é obrigatória para identificação!!!")
    @Size(min = 14, max = 14, message = "A CNDB(CPF) só pode ter 14 caracteres")
    private String cndb;

    @NotNull(message = "O área é obrigatória e deve ser colocada conforme o sistema")
    private Area area;

    @NotNull(message = "O sexo é obrigatório e deve ser colocada conforme o sistema")
    private Sexo sexo;

    @NotBlank(message = "A sala é obrigatória!!!")
    @Size(min = 2, max = 2, message = "A sala só pode ter 2 caracteres")
    private String sala;

    public ProfessorRequestDTO() {
    }

    public ProfessorRequestDTO(
            @NotBlank(message = "O nome é obrigatório!!!") @Size(min = 15, message = "O nome completo deve ter no mínimo 15 caracteres") String nome,
            @Email(message = "Deve ser inserido um email válido!!!") String email,
            @NotBlank(message = "A idade é obrigatória!!!") @Size(min = 1, message = "Você deve ter no mínimo 1 ano de idade.") String idade,
            @NotBlank(message = "A matrícula é obrigatória!!!") @Size(min = 7, max = 7, message = "A matrícula só pode ter 7 caracteres") String cndb,
            @NotNull(message = "O área é obrigatória e deve ser colocada conforme o sistema") Area area,
            @NotNull(message = "O sexo é obrigatório e deve ser colocada conforme o sistema") Sexo sexo,
            @NotBlank(message = "A sala é obrigatória!!!") @Size(min = 2, max = 2, message = "A sala só pode ter 2 caracteres") String sala) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cndb = cndb;
        this.area = area;
        this.sexo = sexo;
        this.sala = sala;
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCndb() {
        return cndb;
    }

    public void setCndb(String cndb) {
        this.cndb = cndb;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    
}
