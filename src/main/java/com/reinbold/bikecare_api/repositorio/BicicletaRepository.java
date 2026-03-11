package com.reinbold.bikecare_api.repositorio;

import com.reinbold.bikecare_api.dominio.Bicicleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {

        }