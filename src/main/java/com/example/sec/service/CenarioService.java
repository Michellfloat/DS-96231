package com.example.sec.service;



import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sec.dto.CenarioRequestDTO;
import com.example.sec.dto.CenarioResponseDTO;
import com.example.sec.model.CenarioModel;
import com.example.sec.repository.CenarioRepository;

@Service
public class CenarioService {
    
    @Autowired
    private CenarioRepository cenarioRepository;

    

    public List<CenarioResponseDTO>listarCenarios(){
        return cenarioRepository.findAll().stream().map(c -> new CenarioResponseDTO(c.getNome(),c.getTipo(),c.getHistoria())).toList();
    }

    public CenarioModel salvarCenarios(CenarioRequestDTO cenarioDTO){
        if (cenarioRepository.findByNome(cenarioDTO.getNome()).isPresent()) {
            throw new RuntimeException("Este cenário já foi criado!!");
        }
        CenarioModel novCenario = new CenarioModel();
        novCenario.setNome(cenarioDTO.getNome());
        novCenario.setTipo(cenarioDTO.getTipo());
        novCenario.setMusica(cenarioDTO.getMusica());
        novCenario.setTecnologia(cenarioDTO.getTecnologia());
        novCenario.setHistoria(cenarioDTO.getHistoria());

        return cenarioRepository.save(novCenario);
    }

    @Transactional
    public CenarioResponseDTO atualizarCenario(Long id, CenarioRequestDTO cenarioDTO){
        CenarioModel cenarioExiste = cenarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Cenário não encontrado!"));

        if (!cenarioExiste.getNome().equals(cenarioDTO.getNome())) {
            if (cenarioRepository.findByNome(cenarioDTO.getNome()).isPresent()) {
                throw new RuntimeException("Este nome já existe,tente outro!");
            }

        }
        cenarioExiste.setNome(cenarioDTO.getNome());
        cenarioExiste.setTipo(cenarioDTO.getTipo());
        cenarioExiste.setMusica(cenarioDTO.getMusica());
        cenarioExiste.setTecnologia(cenarioDTO.getTecnologia());
        cenarioExiste.setHistoria(cenarioDTO.getHistoria());

        CenarioModel atualizado = cenarioRepository.save(cenarioExiste);
        return new CenarioResponseDTO(atualizado.getNome(),atualizado.getTipo(),atualizado.getHistoria());
    }

    @Transactional
    public void deletarCenario(Long id){
        if (!cenarioRepository.existsById(id)) {
            throw new RuntimeException("Cenário não existe!!");
        }
        cenarioRepository.deleteById(id);
    }
}
