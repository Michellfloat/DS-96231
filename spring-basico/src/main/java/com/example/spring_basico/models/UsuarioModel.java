package com.example.spring_basico.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// @Entity:Funciona como um banco de dados dentro da API
// @Id:Indica que o campo id é a chave primária da entidade. Ele é usado para identificar de forma única cada registro na tabela do banco de dados correspondente a esta entidade.
// @GeneratedValue(strategy = GenerationType.IDENTITY):Especifica que o valor do campo id deve ser gerado automaticamente pelo banco de dados. A estratégia GenerationType.IDENTITY indica que o banco de dados deve gerar um valor único para cada novo registro, geralmente usando uma coluna de auto-incremento.
@Entity
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String nome; 
    private String email;
    
    public UsuarioModel() {
    }//construtor vazio para necessidades de junção de projetos, onde o outro consiga instanciar a sua classe e ter acesso//


    public UsuarioModel(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

    

}
