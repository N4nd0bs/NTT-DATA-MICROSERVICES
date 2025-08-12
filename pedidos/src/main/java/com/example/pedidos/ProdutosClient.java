package com.example.pedidos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "produtos", url = "http://localhost:8100")
public interface ProdutosClient {
    @GetMapping("/produtos")
    List<Pedidos> Listar();

    @GetMapping("/produtos/{id}")
    Pedidos Buscar(@PathVariable long id);
}
