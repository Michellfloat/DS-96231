package com.example.demo.dto;

import com.example.demo.model.enums.Area;

public class CursoResponseDTO {
    private String nome;
    private Area area;
    private String sala;
    
    public CursoResponseDTO() {
    }

    public CursoResponseDTO(String nome, Area area, String sala) {
        this.nome = nome;
        this.area = area;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
