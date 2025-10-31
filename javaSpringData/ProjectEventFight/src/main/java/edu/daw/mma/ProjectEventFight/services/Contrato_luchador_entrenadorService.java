package edu.daw.mma.ProjectEventFight.services;

import org.springframework.beans.factory.annotation.Autowired;

import edu.daw.mma.ProjectEventFight.repositories.IContrato_luchador_entrenadorRepository;

public class Contrato_luchador_entrenadorService {

    @Autowired
    private IContrato_luchador_entrenadorRepository contratoRepo;
}
