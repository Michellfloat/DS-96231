package com.example.sec.dto;

import com.example.sec.model.enums.Tecnologia;
import com.example.sec.model.enums.TiposCenario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CenarioRequestDTO {
    @NotBlank(message = "Nome do cenário é obrigatório!")
    @Size(min = 15, max = 200, message = "O nome do cenário deve conter entre 15 e 200 caracteres")
    private String nome;

    @NotNull(message = "O cenário deve ser um dos registrados no sistema.")
    private TiposCenario tipo;

    @NotBlank(message =  "Nome da música é obrigatório!")
    @Size(min = 10, message = "o mínimo que uma música pode ter é 10 caracteres.")
    @Size(max =217, message = "O máximo que uma música pode ter é 200 caracteres")
    private String musica;

    @NotNull(message = "A tecnologia é obrigatória!")
    private Tecnologia tecnologia;

    @NotBlank(message = "A história é obrigatória!")
    @Size(min = 10, message = "O mínimo que uma história pode ter é 10 caracteres.")
    @Size(max = 200, message = "O máximo que uma história pode ter é 200 caracteres.")
    private String historia;

    public CenarioRequestDTO() {
    }

    public CenarioRequestDTO(
            @NotBlank(message = "Nome do cenário é obrigatório!") @Size(min = 15, max = 200, message = "O nome do cenário deve conter entre 15 e 200 caracteres") String nome,
            @NotNull(message = "O cenário deve ser um dos registrados no sistema.") TiposCenario tipo,
            @NotBlank(message = "Nome da música é obrigatório!") @Size(min = 10, message = "o mínimo que uma música pode ter é 10 caracteres.") @Size(max = 217, message = "O máximo que uma música pode ter é 200 caracteres") String musica,
            @NotNull(message = "A tecnologia é obrigatória!") @Size(min = 10, message = "O mínimo que uma tecnologia pode ter é 10 caracteres.") @Size(max = 200, message = "O máximo que uma tecnologia pode ter é 200 caracteres.") Tecnologia tecnologia,
            @NotBlank(message = "A história é obrigatória!") @Size(min = 10, message = "O mínimo que uma história pode ter é 10 caracteres.") @Size(max = 200, message = "O máximo que uma história pode ter é 200 caracteres.") String historia) {
        this.nome = nome;
        this.tipo = tipo;
        this.musica = musica;
        this.tecnologia = tecnologia;
        this.historia = historia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TiposCenario getTipo() {
        return tipo;
    }

    public void setTipo(TiposCenario tipo) {
        this.tipo = tipo;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    

    
}
