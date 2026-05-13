package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ProfessorModel;




@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorModel,Long>{
    Optional<ProfessorModel>findByCndb(String cndb);
}
