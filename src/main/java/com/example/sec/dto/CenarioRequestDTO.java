package com.example.sec.dto;

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
}
