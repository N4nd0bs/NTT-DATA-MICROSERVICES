package com.example.produtos.microservico;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {
    private final ProdutosRepository produtosRepository;

    public ProdutosService(ProdutosRepository produtosRepository){
        this.produtosRepository = produtosRepository;
    }

    public Produtos CadastrarProdutos(Produtos produtos){
        return produtosRepository.save(produtos);
    }

    public List<Produtos> MostrarProdutos(){
        return produtosRepository.findAll();
    }
}