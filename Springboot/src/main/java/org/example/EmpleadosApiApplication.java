package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Asegúrate de que estas dos líneas de importación estén presentes:
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
// Esta línea le dice a Spring: "Busca los repositorios de SQL (Postgres) aquí"
@EnableJpaRepositories(basePackages = "org.example.repository")

// Esta línea le dice a Spring: "Busca los repositorios de NoSQL (Mongo) aquí"
@EnableMongoRepositories(basePackages = "org.example.repository.mongo")
public class EmpleadosApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpleadosApiApplication.class, args);
    }
}