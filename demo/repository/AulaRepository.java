package com.example.demo.repository;

import com.example.demo.entity.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
@repository
public interface AulaRepository extends JpaRepository<Aulass, String> {
    List<aula> dinByNombre(String nombre);
    List<aula> dinByCapacidad(int capacidad);
    List<aula> dinByEdificio(String edificio);

   
}
