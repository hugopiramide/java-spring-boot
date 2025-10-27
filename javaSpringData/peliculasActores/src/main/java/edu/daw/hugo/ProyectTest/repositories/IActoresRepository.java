package edu.daw.hugo.ProyectTest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.daw.hugo.ProyectTest.model.Actor;

public interface IActoresRepository extends JpaRepository<Actor, Long> {
    // @Query("SELECT a FROM Actor a LEFT JOIN FETCH a.actuacion LEFT JOIN FETCH
    // a.actuacion.pelicula WHERE a.actor_id = :id")
    // Optional<Actor> findByIdConActuaciones(Long id);

}