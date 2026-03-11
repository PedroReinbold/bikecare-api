package com.reinbold.bikecare_api.controlador;

import com.reinbold.bikecare_api.dominio.Bicicleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.reinbold.bikecare_api.servico.BicicletaServico;

import java.util.List;

@RestController
@RequestMapping("/bicicletas")
public class BicicletaControlador {
    @Autowired
    private BicicletaServico servico;
    @PostMapping
    public Bicicleta cadastrar(@RequestBody Bicicleta novaBicicleta) {
        return servico.salvarBicicleta(novaBicicleta);
    }

    @GetMapping
    public List<Bicicleta> buscarTodas() {
        return servico.listarTodas();
    }



}