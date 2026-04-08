package com.example.servico.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String,Object>> illegalArgumentException(IllegalArgumentException erro){
        return ResponseEntity
        .status(HttpStatus.CONFLICT)
        .body(Map.of("mensagem",erro.getMessage()));
    }
}
