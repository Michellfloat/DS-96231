package com.example.spring_basico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_basico.models.UsuarioModel;
// @Repository é uma anotação que indica que esta interface é um repositório, ou seja, ela é responsável por fornecer métodos para acessar e manipular os dados relacionados à entidade UsuarioModel. Ela é usada para marcar a interface como um componente de acesso a dados e permitir que o Spring Boot a reconheça como tal.
// JpaRepository é uma interface do Spring Data JPA que fornece métodos prontos para realizar operações de CRUD (Create, Read, Update, Delete) e outras operações comuns em entidades JPA. Ao estender JpaRepository<UsuarioModel, Long>, a interface UsuarioRepository herda esses métodos para a entidade UsuarioModel, onde Long é o tipo do identificador (id) da entidade. Isso significa que você pode usar os métodos fornecidos por JpaRepository para realizar operações no banco de dados relacionadas à entidade UsuarioModel sem precisar implementá-los manualmente.
@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
//Com "interface", você deixa definido um método para todos salvarem, editarem, deletarem e listarem os usuários, sem precisar criar um método para cada ação. O Spring Data JPA já tem esses métodos prontos, então você só precisa estender a interface JpaRepository e passar a entidade (UsuarioModel) e o tipo do identificador (Long) como parâmetros. Assim, você pode usar os métodos fornecidos por JpaRepository para realizar operações no banco de dados relacionadas à entidade UsuarioModel sem precisar implementá-los manualmente.

}
