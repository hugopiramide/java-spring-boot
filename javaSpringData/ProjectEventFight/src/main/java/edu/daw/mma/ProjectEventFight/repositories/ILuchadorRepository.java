package edu.daw.mma.ProjectEventFight.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.daw.mma.ProjectEventFight.model.Luchador;

public interface ILuchadorRepository extends JpaRepository<Luchador, Long> {

    @Query("SELECT DISTINCT l FROM Luchador l WHERE l.nombre LIKE :nombre ")
    Optional<Luchador> filtrarLuchadoresPorNombre(@Param("nombre") String nombre);

}
