package mx.com.aea.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*@Entity
@Data*/
public class UltimoTemaEstudiante /*extends Estudiante*/ {

    public UltimoTemaEstudiante(){

    }
    public UltimoTemaEstudiante(Long id_estudiante, String matricula, String nombre, String apellido, String email, String telefono, Integer id_ultimotema, String titulo_ultimotema) {
        //super();
        this.id_estudiante = id_estudiante;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.id_ultimotema = id_ultimotema;
        this.titulo_ultimotema = titulo_ultimotema;
    }

    /*@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Long id_estudiante;
    private String matricula;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private Integer id_ultimotema;
    private String titulo_ultimotema;


    public Long getId() {
        return id_estudiante;
    }

    public void setId(Long id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getId_ultimotema() {
        return id_ultimotema;
    }

    public void setId_ultimotema(Integer id_ultimotema) {
        this.id_ultimotema = id_ultimotema;
    }

    public String getTitulo_ultimotema() {
        return titulo_ultimotema;
    }

    public void setTitulo_ultimotema(String titulo_ultimotema) {
        this.titulo_ultimotema = titulo_ultimotema;
    }
}
