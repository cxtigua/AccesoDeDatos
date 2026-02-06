package org.example.repository.mongo;

import org.example.model.mongo.EmpleadoMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoMongoRepository extends MongoRepository<EmpleadoMongo, Long> {
}