package edu.daw.mma.ProjectEventFight.services;

import org.springframework.beans.factory.annotation.Autowired;

import edu.daw.mma.ProjectEventFight.repositories.ILuchadorRepository;

public class LuchadorService {

    @Autowired
    private ILuchadorRepository luchadorRepo;
}
