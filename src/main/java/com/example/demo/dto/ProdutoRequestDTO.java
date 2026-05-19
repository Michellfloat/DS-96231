package com.example.demo.dto;

import com.example.demo.model.enums.CategoriaProduto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProdutoRequestDTO {
    @NotBlank(message = "O nome é obrigatório!")
    private String nome;

    @NotNull(message = "O preco do produto deve ser inserido!")
    private Double preco;

    @NotBlank(message = "A descrição é obrigatória")
    private String descricao;

    @NotNull(message = "Por favor informe a quantidade dos produtos, é obrigatório!")
    private int quantidade;

    @NotNull(message = "Por favor informe a categoria")
    private CategoriaProduto categoria;

    public ProdutoRequestDTO() {
    }

    public ProdutoRequestDTO(@NotBlank(message = "O nome é obrigatório!") String nome,
            @NotNull(message = "O preco do produto deve ser inserido!") Double preco,
            @NotBlank(message = "A descrição é obrigatória") String descricao,
            @NotNull(message = "Por favor informe a quantidade dos produtos, é obrigatório!") int quantidade,
            @NotNull(message = "Por favor informe a categoria") CategoriaProduto categoria) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    
}
