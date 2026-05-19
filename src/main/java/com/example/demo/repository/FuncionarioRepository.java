package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FuncionarioModel;



@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel,Long>{
    Optional<FuncionarioModel>findByMatricula(String matricula);
}
