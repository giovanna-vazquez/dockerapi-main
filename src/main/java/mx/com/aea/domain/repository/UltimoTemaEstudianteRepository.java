package mx.com.aea.domain.repository;

import mx.com.aea.domain.model.Estudiante;
import mx.com.aea.domain.model.UltimoTemaEstudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UltimoTemaEstudianteRepository /*extends JpaRepository<UltimoTemaEstudiante, Integer>*/ {

    /*@Query(value = "select e from Estudiante as e where e.matricula = ?1")
    Estudiante findByEnrollment(String registrationnumber);

    @Query(value = "CALL GET_LAST_COURSE(:registrationnumber);", nativeQuery = true)
    UltimoTemaEstudiante findByEnrollment(@Param("registrationnumber") String registrationnumber);*/
}
