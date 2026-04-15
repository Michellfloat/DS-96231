package com.example.atv.atv2.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String,Object>>runtimeException(RuntimeException error){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(Map.of("Mensagem", error.getMessage()));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String,Object>>IllegalArgumentException(IllegalArgumentException error){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("Mensagem", error.getMessage()));
    }
}
