package mx.com.aea.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
@Data
public class Bitacora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long id_estudiante;
    private Integer id_tema;
    private Calendar fecha_registro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(Long id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public Integer getId_tema() {
        return id_tema;
    }

    public void setId_tema(Integer id_tema) {
        this.id_tema = id_tema;
    }

    public Calendar getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Calendar fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
