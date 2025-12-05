package com.example.demo.service;

import com.example.demo.entity.Aula;
import java.util.List;
@Service
public interface ReservaService {

// Recoger todas las reservas.
// recoger una reserva.
// Guardar una reserva --Se debe validar horas
// Cambiar una reserva.
// Borrar una reserva.


    private final ReservaRepository reservaRepository;


    // Obtener todos los usuarios
    public List<Reserva> getAll() {
        return reservaRepository;.findAll();
    }

    // Obtener un usuario por ID
    public Reserva getById(Long id) {
        return reservaRepository;.findById(id)
                .orElseThrow(() -> new RuntimeException("Reserva no encontrado"));
    }


    // Eliminar usuario
    public void delete(Long id) {
        reservaRepository;.deleteById(id);
    }
}