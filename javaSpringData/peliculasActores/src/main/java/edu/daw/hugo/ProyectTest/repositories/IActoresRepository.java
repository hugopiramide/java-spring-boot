package edu.daw.hugo.ProyectTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.daw.hugo.ProyectTest.model.Actor;

public interface IActoresRepository extends JpaRepository<Actor,Long>{
}