package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.api.model.FuncModel;

@Repository
public interface FuncRepository extends JpaRepository <FuncModel, Long>{

}
