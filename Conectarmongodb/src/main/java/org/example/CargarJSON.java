package org.example;

import org.example.ConnectionBBDD;
import org.bson.Document;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

public class CargarJSON {

    public static void main(String[] args) {
        try {
            // Conexión a MongoDB
            var database = ConnectionBBDD.getConnectionMongo();
            System.out.println("Conexión correcta a MongoDB.");

            // Obtener la colección "Alumnos"
            var collection = database.getCollection("Alumnos");

            // Verificar si la colección ya tiene datos
            long count = collection.countDocuments();
            if (count > 0) {
                System.out.println("La colección ya contiene datos. No se insertará el JSON.");
                return; // Terminar el programa
            }

            // Leer el archivo alumnos.json desde resources
            InputStream inputStream = CargarJSON.class.getClassLoader().getResourceAsStream("alumnos.json");
            if (inputStream == null) {
                System.out.println("No se encontró el archivo alumnos.json");
                return;
            }

            String json = new Scanner(inputStream, StandardCharsets.UTF_8).useDelimiter("\\A").next();

            // Convertir JSON a lista de documentos
            List<Document> documentos = Document.parse("{\"array\":" + json + "}").getList("array", Document.class);

            // Insertar documentos en la colección
            collection.insertMany(documentos);
            System.out.println("Documentos insertados correctamente desde JSON!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
