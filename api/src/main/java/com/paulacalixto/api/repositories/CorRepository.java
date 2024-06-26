package com.paulacalixto.api.repositories;

import com.paulacalixto.api.entities.Cor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CorRepository extends JpaRepository<Cor, Long> {

    Optional<Cor> findByNome(String nome);
}
