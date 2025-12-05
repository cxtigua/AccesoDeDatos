package com.example.demo.service;

import com.example.demo.entity.Aula;
import java.util.List;
@Service
public interface AulaService {

// Recoger todas las reservas.
// recoger una reserva.
// Guardar una reserva --Se debe validar horas
// Cambiar una reserva.
// Borrar una reserva.


    private final AulaRepository aulaRepository;


    // Obtener todos los usuarios
    public List<Aula> getAll() {
        return aulaRepository.findAll();
    }

    // Obtener un usuario por ID
    public Aula getById(Long id) {
        return aulaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aula no encontrado"));
    }


    // Eliminar usuario
    public void delete(Long id) {
        aulaRepository.deleteById(id);
    }
}
