package com.example.atv.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.atv.models.FuncionarioModelAntigo;



@Repository
public interface FuncionarioRepositoryAntigo extends JpaRepository<FuncionarioModelAntigo, Long>{
    Optional<FuncionarioModelAntigo>findByEmail(String email);
}
