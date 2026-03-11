package com.reinbold.bikecare_api.controlador;

import com.reinbold.bikecare_api.dominio.Bicicleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reinbold.bikecare_api.servico.BicicletaServico;

@RestController
@RequestMapping("/bicicletas")
public class BicicletaControlador {
    @Autowired
    private BicicletaServico servico;
    @PostMapping
    public Bicicleta cadastrar(@RequestBody Bicicleta novaBicicleta) {
        return servico.salvarBicicleta(novaBicicleta);
    }



}