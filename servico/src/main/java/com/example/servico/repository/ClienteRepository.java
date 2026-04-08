package com.example.servico.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.servico.model.ClienteModel;



@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long>{
    /*Consultar no banco de dados se o email já existe,
    antes de salvar um cliente */
    Optional<ClienteModel> findByEmail(String email);
}
