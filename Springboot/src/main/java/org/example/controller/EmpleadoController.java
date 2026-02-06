package org.example.controller;

import org.example.model.Empleado;
import org.example.model.mongo.EmpleadoMongo;
import org.example.service.EmpleadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
@CrossOrigin("*")
public class EmpleadoController {

    private final EmpleadoService service;

    public EmpleadoController(EmpleadoService service) {
        this.service = service;
    }

    // Listar empleados desde PostgreSQL
    @GetMapping
    public List<Empleado> listarPostgres() {
        return service.listar();
    }

    // Listar empleados desde MongoDB
    @GetMapping("/mongo")
    public List<EmpleadoMongo> listarMongo() {
        return service.listarMongo();
    }

    // Obtener empleado por ID (PostgreSQL)
    @GetMapping("/{id}")
    public ResponseEntity<Empleado> obtener(@PathVariable Long id) {
        Empleado empleado = service.buscar(id);
        return empleado != null ? ResponseEntity.ok(empleado)
                : ResponseEntity.notFound().build();
    }

    // Crear empleado (PostgreSQL + MongoDB)
    @PostMapping
    public ResponseEntity<Empleado> crear(@RequestBody Empleado empleado) {
        int edad = 0;
        Empleado guardado = service.guardar(empleado);
        return ResponseEntity.ok(guardado);
    }

    // Eliminar empleado (PostgreSQL)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        boolean eliminado = service.eliminar(id);
        return eliminado ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}
