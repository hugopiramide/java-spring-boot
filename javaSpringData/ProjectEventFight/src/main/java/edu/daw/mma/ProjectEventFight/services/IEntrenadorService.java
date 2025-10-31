package edu.daw.mma.ProjectEventFight.services;

import java.util.Set;

import edu.daw.mma.ProjectEventFight.DTO.EntrenadorDetallesDTO;
import edu.daw.mma.ProjectEventFight.model.Entrenador;

public interface IEntrenadorService {

    public EntrenadorDetallesDTO insertarEntrenador(Entrenador entrenador);

    public Set<EntrenadorDetallesDTO> listarEntrenadores();

    public EntrenadorDetallesDTO listarEntrenadorPorId(Long id);

    public EntrenadorDetallesDTO modificarEntrenadorPorId(Entrenador entrenador);

    public void elminiarEntrenadorPorId(Long id);

}
