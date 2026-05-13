package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CursoRequestDTO;
import com.example.demo.dto.CursoResponseDTO;
import com.example.demo.model.CursoModel;
import com.example.demo.repository.CursoRepository;

import jakarta.transaction.Transactional;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public CursoModel salvarCursos(CursoRequestDTO curso){
        if (cursoRepository.findByInstituição(curso.getInstituicao()).isPresent()) {
            throw new RuntimeException("Curso já cadastrado!");
        }
        CursoModel novCurso = new CursoModel();
        novCurso.setNome(curso.getNome());
        novCurso.setArea(curso.getArea());
        novCurso.setCarga_horaria(curso.getCarga_horaria());
        novCurso.setInstituição(curso.getInstituicao());
        novCurso.setSala(curso.getSala());

        return cursoRepository.save(novCurso);
    }

    public List<CursoResponseDTO>listarCursos(){
        return cursoRepository.findAll().stream().map(c -> new CursoResponseDTO(c.getNome(),c.getArea(),c.getSala())).toList();
    }

    @Transactional
    public CursoResponseDTO atualizarCursos(Long id, CursoRequestDTO Curso){

        CursoModel CursoExiste = cursoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Este Curso não existe!"));
        
        CursoExiste.setNome(Curso.getNome());
        CursoExiste.setCarga_horaria(Curso.getCarga_horaria());
        CursoExiste.setInstituição(Curso.getInstituicao());
        CursoExiste.setSala(Curso.getSala());
        CursoExiste.setArea(Curso.getArea());

        CursoModel atualizado = cursoRepository.save(CursoExiste);

        return new CursoResponseDTO(atualizado.getNome(),atualizado.getArea(),atualizado.getSala());
    }

    @Transactional
    public void deletarCursos(Long id){
        if (!cursoRepository.existsById(id)) {
            throw new RuntimeException("Este Curso não existe!");
        }
        cursoRepository.deleteById(id);
    }
}
