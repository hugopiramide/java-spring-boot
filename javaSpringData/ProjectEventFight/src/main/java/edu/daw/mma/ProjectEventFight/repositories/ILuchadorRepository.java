package edu.daw.mma.ProjectEventFight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.daw.mma.ProjectEventFight.model.Luchador;

public interface ILuchadorRepository extends JpaRepository<Luchador, Long> {

}
