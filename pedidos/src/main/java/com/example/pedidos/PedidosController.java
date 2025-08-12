package com.example.pedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
    @Autowired
    private ProdutosClient produtosClient;

    @PostMapping
    public ResponseEntity<List<Pedidos>> Pedir(@RequestBody List<Long> ids) {
        List<Pedidos> resultado = ids.stream().map(produtosClient::Buscar).collect(Collectors.toList());
        return ResponseEntity.ok(resultado);
    }
}
