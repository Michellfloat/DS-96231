package com.example.atvapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.atvapi.dto.AlunoRequestDTO;
import com.example.atvapi.dto.AlunoResponseDTO;
import com.example.atvapi.model.AlunoModel;
import com.example.atvapi.repository.AlunoRepository;

import jakarta.transaction.Transactional;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public AlunoModel salvarAlunos(AlunoRequestDTO aluno){
        if (alunoRepository.findByMatricula(aluno.getMatricula()).isPresent()) {
            throw new RuntimeException("Aluno já cadastrado!");
        }
        AlunoModel novAluno = new AlunoModel();
        novAluno.setNome(aluno.getNome());
        novAluno.setEmail(aluno.getEmail());
        novAluno.setIdade(aluno.getIdade());
        novAluno.setMatricula(encoder.encode(aluno.getMatricula()));
        novAluno.setSexo(aluno.getSexo());
        novAluno.setSala(aluno.getSala());
        novAluno.setArea(aluno.getArea());

        return alunoRepository.save(novAluno);
    }

    public List<AlunoResponseDTO>listarAlunos(){
        return alunoRepository.findAll().stream().map(a -> new AlunoResponseDTO(a.getNome(),a.getIdade(),a.getEmail(),a.getSexo(),a.getArea(),a.getSala())).toList();
    }

    @Transactional
    public AlunoResponseDTO atualizarAlunos(Long id, AlunoRequestDTO aluno){

        AlunoModel alunoExiste = alunoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Este aluno não existe!"));
        
        alunoExiste.setNome(aluno.getNome());
        alunoExiste.setEmail(aluno.getEmail());
        alunoExiste.setIdade(aluno.getIdade());
        alunoExiste.setMatricula(aluno.getMatricula());
        alunoExiste.setSexo(aluno.getSexo());
        alunoExiste.setSala(aluno.getSala());
        alunoExiste.setArea(aluno.getArea());

        AlunoModel atualizado = alunoRepository.save(alunoExiste);

        return new AlunoResponseDTO(atualizado.getNome(),atualizado.getIdade(),atualizado.getEmail(),atualizado.getSexo(),atualizado.getArea(),atualizado.getSala());
    }

    @Transactional
    public void deletarAlunos(Long id){
        if (!alunoRepository.existsById(id)) {
            throw new RuntimeException("Este aluno não existe!");
        }
        alunoRepository.deleteById(id);
    }
}
