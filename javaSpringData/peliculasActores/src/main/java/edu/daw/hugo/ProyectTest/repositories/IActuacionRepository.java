package edu.daw.hugo.ProyectTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.daw.hugo.ProyectTest.model.Actuacion;

public interface IActuacionRepository extends JpaRepository<Actuacion, Long> {

}