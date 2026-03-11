package com.reinbold.bikecare_api.servico;

import com.reinbold.bikecare_api.dominio.Bicicleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reinbold.bikecare_api.repositorio.BicicletaRepository;

import java.util.List;

@Service

public class BicicletaServico {
    @Autowired
    private BicicletaRepository repository;

    public Bicicleta salvarBicicleta(Bicicleta novaBicicleta) {

        if (novaBicicleta.getQuilometragemTotal() != null && novaBicicleta.getQuilometragemTotal() < 0) {
            throw new IllegalArgumentException("A quilometragem total não pode ser negativa!");
        }


        return repository.save(novaBicicleta);
    }

    public List<Bicicleta> listarTodas() {
        return repository.findAll();
    }

}
