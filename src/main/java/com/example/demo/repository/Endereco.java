package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EnderecoModel;

@Repository
public interface Endereco extends JpaRepository<EnderecoModel,Long>{
    Optional<EnderecoModel>findByCep(String cep);
}
