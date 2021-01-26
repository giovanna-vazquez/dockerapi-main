package mx.com.aea.domain.controller;

import mx.com.aea.domain.model.Estudiante;
import mx.com.aea.domain.model.Temas;
import mx.com.aea.domain.model.UltimoTemaEstudiante;
import mx.com.aea.domain.repository.EstudianteRepository;
import mx.com.aea.domain.repository.TemasRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
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
        List<Temas> lstTemp= temasRepository.findAll();
        return temasRepository.findAll();
    }

    @GetMapping("/listTopics/")
    public List<Temas> getListTopics() {
        var lstTemas = new ArrayList<Temas>();

        try {
            List<Object> result = temasRepository.findListTopics();
            if (result != null) {
                for (Object obj : result) {
                    Object datos[] = (Object[]) obj;
                    var tema = new Temas();
                    tema.setId(datos[0] == null ? null : (Integer) datos[0]);
                    tema.setTitulo(datos[1] == null ? null : datos[1].toString());
                    lstTemas.add(tema);
                }
            }
        } catch (Exception e) {
        }

        return lstTemas;
    }

    @GetMapping("/topics/{id}")
    public Optional<Temas> getTopic(@PathVariable Integer id) {
        return temasRepository.findById(id);
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
