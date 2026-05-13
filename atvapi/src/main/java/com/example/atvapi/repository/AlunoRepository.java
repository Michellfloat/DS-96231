package com.example.atvapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.atvapi.model.AlunoModel;



@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel,Long>{
Optional<AlunoModel>findByMatricula(String matricula);
}
