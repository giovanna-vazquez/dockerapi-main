package mx.com.aea.domain.repository;

import mx.com.aea.domain.model.Subtemas;
import mx.com.aea.domain.model.Temas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubtemasRepository extends JpaRepository<Subtemas, Integer> {

    @Query(value = "select s.id, s.id_tema, s.titulo from Subtemas as s")
    List<Object> findListSubtopics();

    @Query(value = "select s.id, s.id_tema, s.titulo from Subtemas as s where s.id_tema = ?1")
    List<Object> findListSubtopicsTopic(int id_topic);

}
