package com.example.demo.entity;

import jakarta.persistence.*;

//Definimos la edentidad
@Entity

public class Aula {
    //Es necesario una primary key con el ID
    @id
    //El valor de esta PK es generada automáticamente con esta anotación
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // añadir mínimo 3 atributos (ejemplo: nombre, capacidad, edificio)
    private String nombre;
    private int capacidad;
    private String edificio;
  
}
