package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ColaboradorModel;

@Repository
public interface ColaboradorRepository extends JpaRepository<ColaboradorModel,Long>{
    Optional<ColaboradorModel>findByEmail(String email);
}
