package com.example.sec.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String,Object>>runTimeException(RuntimeException erro){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(Map.of("mensagem",erro.getMessage()));
    }
}
