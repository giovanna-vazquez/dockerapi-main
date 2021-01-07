package mx.com.aea.domain.controller;
import mx.com.aea.domain.model.Estudiante;
import mx.com.aea.domain.model.UltimoTemaEstudiante;
import mx.com.aea.domain.repository.EstudianteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
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
    UltimoTemaEstudiante getStudentByMatricula(@PathVariable String registrationnumber) {
        UltimoTemaEstudiante ultimoTemaEstudiante = null;
        try {
            Object result = estudianteRepository.findByEnrollment(registrationnumber);
            if (result != null) {
                Object datos[] = (Object[]) result;
                ultimoTemaEstudiante = new UltimoTemaEstudiante(
                        datos[0] == null ? null : ((BigInteger) datos[0]).longValue(),
                        datos[1] == null ? null : datos[1].toString(),
                        datos[2] == null ? null : datos[2].toString(),
                        datos[3] == null ? null : datos[3].toString(),
                        datos[4] == null ? null : datos[4].toString(),
                        datos[5] == null ? null : datos[5].toString(),
                        datos[6] == null ? null : (Integer) datos[6],
                        datos[7] == null ? null : datos[7].toString()
                );
            }
        }
        catch (Exception e){ }
        return ultimoTemaEstudiante;
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
