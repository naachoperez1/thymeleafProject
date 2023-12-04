package com.example.thymeleafproject;

import com.example.thymeleafproject.entidades.Estudiante;
import com.example.thymeleafproject.repositorios.EstudianteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafProjectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafProjectApplication.class, args);
    }

    @Autowired
    private EstudianteRepo repositorio;

    @Override
    public void run(String... args) throws Exception {
//        Estudiante estudiante1 = new Estudiante("Name1", "Lastname1", "email1@gmail.com");
//        repositorio.save(estudiante1);
//
//        Estudiante estudiante2 = new Estudiante("Name2", "Lastname2", "email2@gmail.com");
//        repositorio.save(estudiante2);

    }
}
