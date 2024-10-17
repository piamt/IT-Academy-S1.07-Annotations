package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchMethodException {

        System.out.println("Nivell 1 - Exercici 1");
        Worker worker = new Worker("Peter", "Jolie", 15);
        OfficeWorker officeWorker = new OfficeWorker("Peter", "Jolie", 15);
        OnlineWorker onlineWorker = new OnlineWorker("Daniel", "Calvo", 23);

        System.out.println(worker.calculateSalary(30));
        System.out.println(officeWorker.calculateSalary(30));
        System.out.println(onlineWorker.calculateSalary(30));

        System.out.println("\nNivell 1 - Exercici 2");
        System.out.println(officeWorker.getNameWorker());

        System.out.println("\nNivell 2");
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(onlineWorker);
        System.out.println(json);

        if (worker.getClass().isAnnotationPresent(JSONSerializable.class)) {
            String directory = worker.getClass().getAnnotation(JSONSerializable.class).directory();
            try (Writer writer = new FileWriter(directory)) {
                gson.toJson(onlineWorker, writer);
            } catch (IOException e) {
                System.out.println("Error creating json object");
            }
        }
    }
}