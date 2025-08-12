package com.example.produtos.microservico;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    private final ProdutosService produtosService;

    public ProdutosController(ProdutosService produtosService) {
        this.produtosService = produtosService;
    }

    @PostMapping
    public ResponseEntity<Produtos> Cadastrar(@RequestBody Produtos produtos){
        return ResponseEntity.ok(produtosService.CadastrarProdutos(produtos));
    }

    @GetMapping
    public ResponseEntity<List<Produtos>> Listar(){
        return ResponseEntity.ok(produtosService.MostrarProdutos());
    }
}