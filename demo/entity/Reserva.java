package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // añadir mínimo 3 atributos (ejemplo: fecha, horaInicio, horaFin, aulaId)
    // TODO: constructor con parámetros

    private Date fecha;
    private Date horaInicio;
    private Date horaFin;

    private Long aulaId;

    public Reserva(Long id,Date fecha,Date horaInicio,Date horaFin,Long aulaId){
        this.id = id;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

}
