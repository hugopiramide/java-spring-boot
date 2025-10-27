package edu.daw.hugo.ProyectTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.daw.hugo.ProyectTest.model.Pelicula;

public interface IPeliculasRepository extends JpaRepository<Pelicula, Long> {
    // @Query("SELECT p FROM Pelicula p LEFT JOIN FETCH p.actuacion a WHERE
    // a.actor_id = :id")
    // Pelicula findByIdPeliculaConActor(Long id);
}