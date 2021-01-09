package mx.com.aea.domain.repository;

import mx.com.aea.domain.model.Temas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TemasRepository extends JpaRepository<Temas, Integer> {

    @Query(value = "CALL GET_REMAINING_TOPICS(:param_id_estudiante);", nativeQuery = true)
    List<Temas> getRemainingTopics(@Param("param_id_estudiante") long param_id_estudiante);
}
