package edu.daw.hugo.ProyectTest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.daw.hugo.ProyectTest.model.Pelicula;

public interface IPeliculasRepository extends JpaRepository<Pelicula, Long> {
    @Query("SELECT p FROM Pelicula p LEFT JOIN FETCH p.actores LEFT JOIN FETCH p.criticas WHERE p.pelicula_id = :id")
    Optional<Pelicula> findByIdConActoresYCriticas(Long id);
}