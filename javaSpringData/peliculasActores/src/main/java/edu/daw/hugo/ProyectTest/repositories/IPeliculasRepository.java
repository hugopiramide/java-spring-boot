package edu.daw.hugo.ProyectTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.daw.hugo.ProyectTest.model.Pelicula;

public interface IPeliculasRepository extends JpaRepository<Pelicula, Long> {
}