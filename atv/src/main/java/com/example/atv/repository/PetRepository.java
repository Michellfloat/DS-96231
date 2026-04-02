package com.example.atv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.atv.models.PetModels;

@Repository
public interface PetRepository extends JpaRepository<PetModels, Long>{

}
