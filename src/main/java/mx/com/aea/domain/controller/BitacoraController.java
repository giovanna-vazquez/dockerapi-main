package mx.com.aea.domain.controller;

import mx.com.aea.domain.model.Bitacora;
import mx.com.aea.domain.model.Temas;
import mx.com.aea.domain.repository.BitacoraRepository;
import mx.com.aea.domain.repository.TemasRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@RestController
public class BitacoraController {
    private BitacoraRepository bitacoraRepository;

    public BitacoraController(mx.com.aea.domain.repository.BitacoraRepository bitacoraRepository) {
        this.bitacoraRepository = bitacoraRepository;
    }

    @GetMapping("/topicslog/")
    public List<Bitacora> getAllTopics() {
        return bitacoraRepository.findAll();
    }

    @PostMapping("/topicslog/")
    public ResponseEntity saveRegister(@RequestBody Bitacora log) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        /*Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());*/
        Calendar c = Calendar.getInstance();
        log.setFecha_registro(c);
        bitacoraRepository.save(log);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
