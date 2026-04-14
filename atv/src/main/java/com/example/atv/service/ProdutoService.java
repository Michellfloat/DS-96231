package com.example.atv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.atv.models.ProdutoModel;
import com.example.atv.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    
    @GetMapping
    public List<ProdutoModel> listarProdutos(){
        return produtoRepository.findAll();
    }

    @PostMapping
    public ProdutoModel salvarProdutos(ProdutoModel produto){
       if(produtoRepository.findByNome(produto.getNome()).isPresent()){
        throw new RuntimeException("Produto já existente!!");
       } 
       return produtoRepository.save(produto);
    }

    public ProdutoModel atualizarProduto(Long id, ProdutoModel produto){
        if (!produtoRepository.existsById(id)) {
            throw new IllegalArgumentException("Funcionário não encontrado!");
        }
        /*Mantém o id para não criar outro funcionario.
        Altera todos os outros dados */
        produto.setId(id);
        return produtoRepository.save(produto);
    }

    public void excluirProduto(Long id){
        if(!produtoRepository.existsById(id)){
            throw new IllegalArgumentException("Funcionário não encontrado.");
        }
        produtoRepository.deleteById(id);
    }
}
