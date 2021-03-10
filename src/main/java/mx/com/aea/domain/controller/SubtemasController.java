package mx.com.aea.domain.controller;

import mx.com.aea.domain.model.Subtemas;
import mx.com.aea.domain.repository.SubtemasRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class SubtemasController {
    private SubtemasRepository subtemasRepository;

    public SubtemasController(SubtemasRepository subtemasRepository) {
        this.subtemasRepository = subtemasRepository;
    }

    @GetMapping("/subtopics/")
    public List<Subtemas> getAllSubtopics() {
        List<Subtemas> lstTemp= subtemasRepository.findAll();
        return subtemasRepository.findAll();
    }

    @GetMapping("/listSubtopics/")
    public List<Subtemas> getListSubtopics() {
        var lstSubtemas = new ArrayList<Subtemas>();

        try {
            List<Object> result = subtemasRepository.findListSubtopics();
            if (result != null) {
                for (Object obj : result) {
                    Object datos[] = (Object[]) obj;
                    var tema = new Subtemas();
                    tema.setId(datos[0] == null ? null : (Integer) datos[0]);
                    tema.setId_tema(datos[1] == null ? null : (Integer) datos[1]);
                    tema.setTitulo(datos[2] == null ? null : datos[2].toString());
                    lstSubtemas.add(tema);
                }
            }
        } catch (Exception e) {
        }

        return lstSubtemas;
    }

    @GetMapping("/listSubtopicsTopic/{id_topic}")
    public List<Subtemas> getListSubtopicsTopic(@PathVariable Integer id_topic) {
        var lstSubtemas = new ArrayList<Subtemas>();

        try {
            List<Object> result = subtemasRepository.findListSubtopicsTopic(id_topic);
            if (result != null) {
                for (Object obj : result) {
                    Object datos[] = (Object[]) obj;
                    var tema = new Subtemas();
                    tema.setId(datos[0] == null ? null : (Integer) datos[0]);
                    tema.setId_tema(datos[1] == null ? null : (Integer) datos[1]);
                    tema.setTitulo(datos[2] == null ? null : datos[2].toString());
                    lstSubtemas.add(tema);
                }
            }
        } catch (Exception e) {
        }

        return lstSubtemas;
    }

    @GetMapping("/subtopics/{id}")
    public Optional<Subtemas> getTopic(@PathVariable Integer id) {
        return subtemasRepository.findById(id);
    }


    @PostMapping("/subtopics/")
    public ResponseEntity saveStudent(@RequestBody Subtemas subtopic) {
        subtemasRepository.save(subtopic);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/subtopics/{id}")
    public ResponseEntity updateStudent(@RequestBody Subtemas subtopic, @PathVariable Integer id) {
        Optional<Subtemas> subtopicOptional = subtemasRepository.findById(id);
        if (!subtopicOptional.isPresent())
            return ResponseEntity.notFound().build();
        subtopic.setId(id);
        subtemasRepository.save(subtopic);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
