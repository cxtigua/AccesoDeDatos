package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/aula")

public class AulaController {

    private final AulaService aulaService;

    public AulaController(AulaService aulaService) {
        this.aulaService = aulaService;
    }

  // Devolver todas las aulas
  // Devolver un aula 
  // añadir aula -- no se debe repetir
  // modificar aula
  // borrar aula


    @GetMapping
    public List<Aula> getAll() {
        return aulaService.getAll();
    }

    @GetMapping("/{id}")
    public Aula getById(@PathVariable Long id) {
        return aulaService.getById(id);
    }

    @PostMapping
    public Aula create(@RequestBody Aula aula) {
        return AulaService.create(aula);
    }

    @PutMapping("/{id}")
    public Aula update(@PathVariable Long id, @RequestBody Aula aula) {
        return aulaService.update(id, aula);
    }

    @PatchMapping("/{id}")
    public Aula patch(@PathVariable Long id, @RequestBody Map<String, Object> cambios) {
        return aulaService.patch(id, cambios);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        aulaService.delete(id);
    }
}