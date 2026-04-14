package com.example.atv.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.atv.models.ProdutoModel;
import java.util.List;








@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
    Optional<ProdutoModel>findByNome(String nome);
}
