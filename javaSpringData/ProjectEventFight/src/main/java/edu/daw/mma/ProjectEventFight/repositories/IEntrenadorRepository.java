package edu.daw.mma.ProjectEventFight.repositories;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.daw.mma.ProjectEventFight.model.Entrenador;

public interface IEntrenadorRepository extends JpaRepository<Entrenador, Long> {

    // @Query("SELECT e FROM Entrenador e " +
    // "INNER JOIN FETCH e.luchador l " +
    // "INNER JOIN FETCH l.pelea p " +
    // "WHERE e.entrenador_id = :id")
    // public Optional<BigDecimal> salarioPercibidoEnComisiones(Long id);

}
