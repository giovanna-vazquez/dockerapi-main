package mx.com.aea.domain.controller;
import mx.com.aea.domain.model.Estudiante;
import mx.com.aea.domain.repository.EstudianteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstudianteController {

    private EstudianteRepository estudianteRepository;

    public EstudianteController(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @GetMapping("/students/")
    public List<Estudiante> getAllStudent() {
        return estudianteRepository.findAll();
    }

    /*@GetMapping("/students/")
    public @ResponseBody Iterable<Estudiante> getAllStudent() {
        return estudianteRepository.findAll();
    }*/

    @GetMapping("/studentByEnrollment/{registrationnumber}")
    public @ResponseBody
    Estudiante getStudentByMatricula(@PathVariable String registrationnumber) {
        return estudianteRepository.findByEnrollment(registrationnumber);
    }

    @PostMapping("/student/")
    public ResponseEntity saveStudent(@RequestBody Estudiante student) {
        estudianteRepository.save(student);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity updateStudent(@RequestBody Estudiante student, @PathVariable long id) {
        Optional<Estudiante> studentOptional = estudianteRepository.findById(id);
        if (!studentOptional.isPresent())
            return ResponseEntity.notFound().build();
        student.setId(id);
        estudianteRepository.save(student);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
