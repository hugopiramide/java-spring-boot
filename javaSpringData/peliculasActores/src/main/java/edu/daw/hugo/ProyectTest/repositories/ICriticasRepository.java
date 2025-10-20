package edu.daw.hugo.ProyectTest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.daw.hugo.ProyectTest.model.Critica;

public interface ICriticasRepository extends JpaRepository<Critica, Long> {
    @Query("SELECT c FROM Critica c LEFT JOIN FETCH c.pelicula WHERE c.critica_id = :id")
    Optional<Critica> findByIdConPelicula(Long id);
}
