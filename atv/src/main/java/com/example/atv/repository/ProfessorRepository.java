package com.example.atv.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.atv.models.ProfessorModel;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorModel, Long>{

}
