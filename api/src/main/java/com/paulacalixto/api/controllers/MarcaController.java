package com.paulacalixto.api.controllers;

import com.paulacalixto.api.entities.Marca;
import com.paulacalixto.api.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/marcas")
@CrossOrigin(value = "http://localhost:4200",
        methods = {RequestMethod.GET,
                RequestMethod.POST,
                RequestMethod.PUT,
                RequestMethod.DELETE})
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping
    public List<Marca> listarMarcas() {
        return this.marcaService.listarMarcas();
    }

    @PostMapping
    public void adicionarMarca(@RequestBody Marca marca) {
        this.marcaService.adicionarMarca(marca);
    }
}
