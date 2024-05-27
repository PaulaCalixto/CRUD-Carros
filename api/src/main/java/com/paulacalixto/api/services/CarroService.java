package com.paulacalixto.api.services;

import com.paulacalixto.api.entities.Carro;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CarroService {

    List<Carro> listarCarros();
    ResponseEntity adicionarCarro(Carro carro);
    ResponseEntity excluirCarro(Long id);
    ResponseEntity atualizarCarro(Long id, Carro carro);
}
