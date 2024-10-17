package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;

public class Main {

    @SuppressWarnings("Deprecated")
    public static void main(String[] args) throws IOException, NoSuchMethodException {

        System.out.println("Nivell 1 - Exercici 1");
        Worker worker = new Worker("Peter", "Jolie", new BigDecimal(15));
        OfficeWorker officeWorker = new OfficeWorker("Peter", "Jolie", new BigDecimal(20));
        OnlineWorker onlineWorker = new OnlineWorker("Daniel", "Calvo", new BigDecimal(23));

        System.out.println(worker.calculateSalary(30));
        System.out.println(officeWorker.calculateSalary(30));
        System.out.println(onlineWorker.calculateSalary(30));

        System.out.println("\nNivell 1 - Exercici 2");
        System.out.println(officeWorker.getNameWorker());

        System.out.println("\nNivell 2");
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(officeWorker);
        System.out.println(json);

        if (officeWorker.getClass().isAnnotationPresent(JSONSerializable.class)) {
            String directory = officeWorker.getClass().getAnnotation(JSONSerializable.class).directory();
            try (Writer writer = new FileWriter(directory)) {
                gson.toJson(officeWorker, writer);
            } catch (IOException e) {
                System.out.println("Error creating json object");
            }
        }
    }
}