package mx.com.aea.domain.controller;

import mx.com.aea.domain.model.UltimoTemaEstudiante;
import mx.com.aea.domain.repository.EstudianteRepository;
import mx.com.aea.domain.repository.UltimoTemaEstudianteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UltimoTemaEstudianteController {

    /*private UltimoTemaEstudianteRepository ultimoTemaEstudianteRepository;

    public UltimoTemaEstudianteController(UltimoTemaEstudianteRepository ultimoTemaEstudianteRepository) {
        this.ultimoTemaEstudianteRepository = ultimoTemaEstudianteRepository;
    }

    @GetMapping("/studentByEnrollment/{registrationnumber}")
    public @ResponseBody
    UltimoTemaEstudiante getStudentByMatricula(@PathVariable String registrationnumber) {
        return ultimoTemaEstudianteRepository.findByEnrollment(registrationnumber);
    }*/
}
