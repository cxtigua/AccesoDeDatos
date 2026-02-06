package org.example.model.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Empleado")
public class EmpleadoMongo {

    @Id
    private Long idEmpleado;
    private String nombre;
    private String puesto;
    private String tipoJornada;
    private String email;
    private String telefono;
    private java.time.LocalDate fechaContratacion;
    private double salarioHora;
    private boolean activo;

    // getters y setters
    public Long getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(Long idEmpleado) { this.idEmpleado = idEmpleado; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public String getTipoJornada() { return tipoJornada; }
    public void setTipoJornada(String tipoJornada) { this.tipoJornada = tipoJornada; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public java.time.LocalDate getFechaContratacion() { return fechaContratacion; }
    public void setFechaContratacion(java.time.LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalarioHora() { return salarioHora; }
    public void setSalarioHora(double salarioHora) { this.salarioHora = salarioHora; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
}


