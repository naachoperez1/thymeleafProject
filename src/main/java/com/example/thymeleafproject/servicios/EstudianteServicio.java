package com.example.thymeleafproject.servicios;

import com.example.thymeleafproject.entidades.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteServicio {
    public List<Estudiante> listarEstudiantes();
    public Estudiante guardarEstudiante (Estudiante estudiante);
    public Estudiante obtenerEstudiantePorID (Long id);
    public Estudiante actualizarEstudiante (Estudiante estudiante);
    public void eliminarEstudiante (Long id);

}
