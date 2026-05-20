package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProfessorRequestDTO;
import com.example.demo.dto.ProfessorResponseDTO;

import com.example.demo.model.ProfessorModel;

import com.example.demo.repository.ProfessorRepository;

import jakarta.transaction.Transactional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public ProfessorModel salvarProfessores(ProfessorRequestDTO professor){
        if (professorRepository.findByCndb(professor.getCndb()).isPresent()) {
            throw new RuntimeException("professor já cadastrado!");
        }
        ProfessorModel novprofessor = new ProfessorModel();
        novprofessor.setNome(professor.getNome());
        novprofessor.setEmail(professor.getEmail());
        novprofessor.setIdade(professor.getIdade());
        novprofessor.setCndb(encoder.encode(professor.getCndb()));
        novprofessor.setSexo(professor.getSexo());
        novprofessor.setSala(professor.getSala());
        novprofessor.setArea(professor.getArea());

        return professorRepository.save(novprofessor);
    }

    public List<ProfessorResponseDTO>listarProfessores(){
        return professorRepository.findAll().stream().map(p -> new ProfessorResponseDTO(p.getNome(),p.getIdade(),p.getEmail(),p.getSexo(),p.getArea(),p.getSala())).toList();
    }

    @Transactional
    public ProfessorResponseDTO atualizarProfessores(Long id, ProfessorRequestDTO professor){

        ProfessorModel professorExiste = professorRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Este professor não existe!"));
        
        professorExiste.setNome(professor.getNome());
        professorExiste.setEmail(professor.getEmail());
        professorExiste.setIdade(professor.getIdade());
        professorExiste.setCndb(professor.getCndb());
        professorExiste.setSexo(professor.getSexo());
        professorExiste.setSala(professor.getSala());
        professorExiste.setArea(professor.getArea());

        ProfessorModel atualizado = professorRepository.save(professorExiste);

        return new ProfessorResponseDTO(atualizado.getNome(),atualizado.getIdade(),atualizado.getEmail(),atualizado.getSexo(),atualizado.getArea(),atualizado.getSala());
    }

    @Transactional
    public void deletarProfessores(Long id){
        if (!professorRepository.existsById(id)) {
            throw new RuntimeException("Este professor não existe!");
        }
        professorRepository.deleteById(id);
    }
}
