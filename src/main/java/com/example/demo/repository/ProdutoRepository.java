package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel,Long>{
    Optional<ProdutoModel>findByNome(String nome);
}
