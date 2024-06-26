package com.paulacalixto.api.util;

import com.paulacalixto.api.entities.Carro;
import com.paulacalixto.api.repositories.CarroRepository;
import com.paulacalixto.api.services.CorService;
import com.paulacalixto.api.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CarroUtil {

    private final CarroRepository carroRepository;
    private final MarcaService marcaService;
    private final CorService corService;

    @Autowired
    public CarroUtil(CarroRepository carroRepository, MarcaService marcaService, CorService corService) {
        this.carroRepository = carroRepository;
        this.marcaService = marcaService;
        this.corService = corService;
    }

    public Carro verificarDadosCarro(Carro carro) {

        Optional<List<Carro>> carroOptionalList = carroRepository.findCarrosByNome(carro.getNome());

        if (carroOptionalList.isPresent()) {
            for (Carro carroOptional : carroOptionalList.get()) {

                if (carroOptional.getAnoFabricacao() == carro.getAnoFabricacao()
                        && carroOptional.getAnoModelo() == carro.getAnoModelo()
                        && carroOptional.getModelo().equalsIgnoreCase(carro.getModelo())){

                    return carroOptional;
                }
            }
        }
        return null;
    }

    public void confirmarAdicao(Carro carro) {
        marcaService.adicionarMarca(carro.getMarca());
        corService.adicionarCor(carro.getCores());
        carroRepository.save(carro);
    }
}
