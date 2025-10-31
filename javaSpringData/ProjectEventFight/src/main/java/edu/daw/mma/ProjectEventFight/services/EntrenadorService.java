package edu.daw.mma.ProjectEventFight.services;

import org.springframework.beans.factory.annotation.Autowired;

import edu.daw.mma.ProjectEventFight.repositories.IEntrenadorRepository;

public class EntrenadorService {

    @Autowired
    private IEntrenadorRepository entrenadorRepo;
}
