package com.example.thymeleafproject.repositorios;

import com.example.thymeleafproject.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepo extends JpaRepository<Estudiante, Long> {
}
