package mx.com.aea.domain.controller;

import mx.com.aea.domain.model.Estudiante;
import mx.com.aea.domain.model.Temas;
import mx.com.aea.domain.model.UltimoTemaEstudiante;
import mx.com.aea.domain.repository.EstudianteRepository;
import mx.com.aea.domain.repository.TemasRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TemasController {
    private TemasRepository temasRepository;

    public TemasController(TemasRepository temasRepository) {
        this.temasRepository = temasRepository;
    }

    @GetMapping("/topics/")
    public List<Temas> getAllTopics() {
        return temasRepository.findAll();
    }

    @GetMapping("/remainingTopics/{id_estudiante}")
    public List<Temas> getRemainingTopics(@PathVariable long id_estudiante) {
        return temasRepository.getRemainingTopics(id_estudiante);
    }

    @PostMapping("/topics/")
    public ResponseEntity saveStudent(@RequestBody Temas topic) {
        temasRepository.save(topic);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/topics/{id}")
    public ResponseEntity updateStudent(@RequestBody Temas topic, @PathVariable Integer id) {
        Optional<Temas> topicOptional = temasRepository.findById(id);
        if (!topicOptional.isPresent())
            return ResponseEntity.notFound().build();
        topic.setId(id);
        temasRepository.save(topic);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
