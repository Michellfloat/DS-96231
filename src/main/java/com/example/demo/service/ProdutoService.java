package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProdutoRequestDTO;
import com.example.demo.dto.ProdutoResponseDTO;
import com.example.demo.model.ProdutoModel;
import com.example.demo.repository.ProdutoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    

    public ProdutoModel salvarProdutos(ProdutoRequestDTO produto){
        if (produtoRepository.findByNome(produto.getNome()).isPresent()) {
            throw new RuntimeException("produto já cadastrado!");
        }
        ProdutoModel novProduto = new ProdutoModel();
        novProduto.setNome(produto.getNome());
        novProduto.setCategoria(produto.getCategoria());
        novProduto.setDescricao(produto.getDescricao());
        novProduto.setPreco(produto.getPreco());
        novProduto.setQuantidade(produto.getQuantidade());

        return produtoRepository.save(novProduto);
    }

    public List<ProdutoResponseDTO>listarProdutos(){
        return produtoRepository.findAll().stream().map(p -> new ProdutoResponseDTO(p.getNome(),p.getPreco(),p.getDescricao(),p.getQuantidade())).toList();
    }

    @Transactional
    public ProdutoResponseDTO atualizarProdutos(Long id, ProdutoRequestDTO produto){

        ProdutoModel produtoExiste = produtoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Este produto não existe!"));
        
        produtoExiste.setNome(produto.getNome());
        produtoExiste.setCategoria(produto.getCategoria());
        produtoExiste.setDescricao(produto.getDescricao());
        produtoExiste.setPreco(produto.getPreco());
        produtoExiste.setQuantidade(produto.getQuantidade());

        ProdutoModel atualizado = produtoRepository.save(produtoExiste);

        return new ProdutoResponseDTO(atualizado.getNome(),atualizado.getPreco(),atualizado.getDescricao(),atualizado.getQuantidade());
    }

    @Transactional
    public void deletarProdutos(Long id){
        if (!produtoRepository.existsById(id)) {
            throw new RuntimeException("Este produto não existe!");
        }
        produtoRepository.deleteById(id);
    }
}
