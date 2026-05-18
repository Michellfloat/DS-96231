package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ColaboradorRequestDTO;
import com.example.demo.dto.ColaboradorResponseDTO;
import com.example.demo.model.ColaboradorModel;
import com.example.demo.repository.ColaboradorRepository;

import jakarta.transaction.Transactional;

@Service
public class ColaboradorService {
    @Autowired
    private ColaboradorRepository colaboradorRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public ColaboradorModel salvarColaboradores(ColaboradorRequestDTO colaborador){
        if (colaboradorRepository.findByEmail(colaborador.getEmail()).isPresent()) {
            throw new RuntimeException("colaborador já cadastrado!");
        }
        ColaboradorModel novColaborador = new ColaboradorModel();
        novColaborador.setNome(colaborador.getNome());
        novColaborador.setCargo(colaborador.getCargo());
        novColaborador.setEmail(colaborador.getEmail());
        novColaborador.setSenha(encoder.encode(colaborador.getSenha()));
        novColaborador.setTelefone(colaborador.getTelefone());

        return colaboradorRepository.save(novColaborador);
    }

    public List<ColaboradorResponseDTO>listarColaboradores(){
        return colaboradorRepository.findAll().stream().map(c -> new ColaboradorResponseDTO(c.getNome(),c.getEmail(),c.getTelefone(),c.getCargo())).toList();
    }

    @Transactional
    public ColaboradorResponseDTO atualizarColaboradores(Long id, ColaboradorRequestDTO colaborador){

        ColaboradorModel colaboradorExiste = colaboradorRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Este colaborador não existe!"));
        
        colaboradorExiste.setNome(colaborador.getNome());
        colaboradorExiste.setCargo(colaborador.getCargo());
        colaboradorExiste.setEmail(colaborador.getEmail());
        colaboradorExiste.setSenha(encoder.encode(colaborador.getSenha()));
        colaboradorExiste.setTelefone(colaborador.getTelefone());
        ColaboradorModel atualizado = colaboradorRepository.save(colaboradorExiste);

        return new ColaboradorResponseDTO(atualizado.getNome(),atualizado.getEmail(),atualizado.getTelefone(),atualizado.getCargo());
    }

    @Transactional
    public void deletarColaboradores(Long id){
        if (!colaboradorRepository.existsById(id)) {
            throw new RuntimeException("Este colaborador não existe!");
        }
        colaboradorRepository.deleteById(id);
    }
}
