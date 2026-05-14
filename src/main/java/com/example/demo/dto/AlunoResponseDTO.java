package com.example.demo.dto;

import com.example.demo.model.enums.Area;
import com.example.demo.model.enums.Sexo;

public class AlunoResponseDTO {
    private String nome;
    private String idade;
    private String email;
    private Sexo sexo;
    private Area area;
    private String sala;
    
    public AlunoResponseDTO() {
    }

    public AlunoResponseDTO(String nome, String idade, String email, Sexo sexo, Area area, String sala) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.sexo = sexo;
        this.area = area;
        this.sala = sala;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    
}
