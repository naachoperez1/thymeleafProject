package com.example.thymeleafproject.controladores;

import com.example.thymeleafproject.entidades.Estudiante;
import com.example.thymeleafproject.servicios.EstudianteServicio;
import com.example.thymeleafproject.servicios.EstudianteServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EstudianteController {
    @Autowired
    private EstudianteServicio servicio;

    @GetMapping("/estudiantes")
    public String listarEstudiantes (Model model){
        model.addAttribute("estudiantes", servicio.listarEstudiantes());
        return "estudiantes";
    }

    @GetMapping("/estudiantes/nuevo")
    public String mostrarFormularioDeRegistroDeEstudiante (Model model){
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);
        return "crear_estudiante";
    }

    @PostMapping ("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante){
        servicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping ("/estudiantes/editar/{id}")
    public String mostrarFormularioDeEdicionDeEstudiante (@PathVariable Long id, Model modelo){
        modelo.addAttribute("estudiante",servicio.obtenerEstudiantePorID(id));
        return "editar_estudiante";
    }

    @PostMapping  ("/estudiantes/{id}")
    public String actualizarEstudiante (@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante, Model modelo){
        Estudiante estudianteExistente = servicio.obtenerEstudiantePorID(id);
        estudianteExistente.setId(id);
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApellido(estudiante.getApellido());
        estudianteExistente.setEmail(estudiante.getEmail());
        servicio.actualizarEstudiante(estudianteExistente);
        return "redirect:/estudiantes";
    }

    @GetMapping ("/estudiantes/{id}")
    public String eliminarEstudiante (@PathVariable Long id){
        servicio.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }
}
