package edu.daw.mma.ProjectEventFight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.daw.mma.ProjectEventFight.model.Pelea;

public interface IPeleaRepository extends JpaRepository<Pelea, Long> {

}