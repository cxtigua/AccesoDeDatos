package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
