package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/reserva")

public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

  // Devolver todas las reserva
  // Devolver un reserva 
  // añadir reserva -- no se debe repetir
  // modificar reserva
  // borrarreserva
   @GetMapping
    public List<Reserva> getAll() {
        return reservaService.getAll();
    }

    @GetMapping("/{id}")
    public Reserva getById(@PathVariable Long id) {
        return reservaService.getById(id);
    }

    @PostMapping
    public Reserva create(@RequestBody Reserva reserva) {
        return reservaService.create(reserva);
    }

    @PutMapping("/{id}")
    public Reserva update(@PathVariable Long id, @RequestBody Reserva reserva) {
        return reservaService.update(id, reserva);
    }

    @PatchMapping("/{id}")
    public Reserva patch(@PathVariable Long id, @RequestBody Map<String, Object> cambios) {
        return reservaService.patch(id, cambios);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        reservaService.delete(id);
    }
}
}
