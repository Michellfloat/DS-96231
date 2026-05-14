package com.example.demo.dto;

import com.example.demo.model.enums.Area;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CursoRequestDTO {
    @NotBlank(message = "O nome é obrigatório!!!")
    @Size(min = 15, message = "O nome completo deve ter no mínimo 15 caracteres")
    private String nome;

    @NotBlank(message = "Nome da Instituição é obrigatório!")
    private String instituicao;

    @NotBlank(message = "Carga horária é obrigatória")
    @Size(max = 45, message = "O curso só pode ter no máximo 45 caracteres")
    private String carga_horaria;

    @NotNull(message = "O área é obrigatória e deve ser colocada conforme o sistema")
    private Area area;

    @NotBlank(message = "A sala é obrigatória!!!")
    @Size(min = 2, max = 2, message = "A sala só pode ter 2 caracteres")
    private String sala;

    public CursoRequestDTO() {
    }

    public CursoRequestDTO(
            @NotBlank(message = "O nome é obrigatório!!!") @Size(min = 15, message = "O nome completo deve ter no mínimo 15 caracteres") String nome,
            @NotBlank(message = "Nome da Instituição é obrigatório!") String instituicao,
            @NotBlank(message = "Carga horária é obrigatória") @Size(max = 45, message = "O curso só pode ter no máximo 45 caracteres") String carga_horaria,
            @NotNull(message = "O área é obrigatória e deve ser colocada conforme o sistema") Area area,
            @NotBlank(message = "A sala é obrigatória!!!") @Size(min = 2, max = 2, message = "A sala só pode ter 2 caracteres") String sala) {
        this.nome = nome;
        this.instituicao = instituicao;
        this.carga_horaria = carga_horaria;
        this.area = area;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(String carga_horaria) {
        this.carga_horaria = carga_horaria;
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
