package org.example.service;

import org.example.model.Empleado;
import org.example.model.mongo.EmpleadoMongo;
import org.example.repository.EmpleadoRepository;
import org.example.repository.mongo.EmpleadoMongoRepository;
import org.springframework.stereotype.Service;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import java.util.List;

@Service
public class EmpleadoService {

    private final EmpleadoRepository repoPostgres;
    private final EmpleadoMongoRepository repoMongo;

    public EmpleadoService(EmpleadoRepository repoPostgres,
                           EmpleadoMongoRepository repoMongo) {
        this.repoPostgres = repoPostgres;
        this.repoMongo = repoMongo;
    }

    public List<Empleado> listar() {
        return repoPostgres.findAll();
    }

    // 🔥 ESTE MÉTODO ES LA CLAVE DEL EJERCICIO
    public Empleado guardar(Empleado empleado) {

        // 1️⃣ Guardar en PostgreSQL
        Empleado guardado = repoPostgres.save(empleado);

        // 2️⃣ Guardar en MongoDB
        EmpleadoMongo mongo = new EmpleadoMongo();
        mongo.setIdEmpleado(guardado.getIdEmpleado());
        mongo.setNombre(empleado.getNombre());
        mongo.setPuesto(empleado.getPuesto());
        mongo.setTipoJornada(empleado.getTipoJornada());
        mongo.setEmail(empleado.getEmail());
        mongo.setTelefono(empleado.getTelefono());
        mongo.setFechaContratacion(empleado.getFechaContratacion());
        mongo.setSalarioHora(empleado.getSalarioHora());
        mongo.setActivo(empleado.isActivo());

        repoMongo.save(mongo);

        return guardado;
    }

    public Empleado buscar(Long id) {
        return repoPostgres.findById(id).orElse(null);
    }

    public boolean eliminar(Long id) {
        if (repoPostgres.existsById(id)) {
            repoPostgres.deleteById(id);
            return true;
        }
        return false;
    }

    public List<EmpleadoMongo> listarMongo() {
        return repoMongo.findAll();
    }
}

