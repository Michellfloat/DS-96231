package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CursoModel;



@Repository
public interface CursoRepository extends JpaRepository<CursoModel,Long>{
    Optional<CursoModel>findByInstituição(String instituição);
}
