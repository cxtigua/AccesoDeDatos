package org.example;
public class Main {
    public static void main(String[] args) {
        try {
            ConnectionBBDD.getConnectionMongo();
            System.out.println("Conexión correcta a Mongodb.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        Alumno alumno = new Alumno();

        // Llama al metodo para ver los alumnos
        //alumno.listarAlumnos();
        // Insertar Alumno
        //alumno.insertAlumno("Juana", "Perez", "Guerrero", 25);
        // Actualizar Alumno
        //alumno.actualizarAlumno("Mónica", "Mónica", "Blásquez", "Güera", 20);
        // Borrar Alumno
        //alumno.deleteByName("ana");
    }
}