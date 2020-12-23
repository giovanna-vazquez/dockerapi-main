package mx.com.aea.domain.repository;

import mx.com.aea.domain.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    @Query(value = "select e from Estudiante as e where e.matricula = ?1")
    Estudiante findByEnrollment(String registrationnumber);
}
