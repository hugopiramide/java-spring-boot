package edu.daw.mma.ProjectEventFight.services;

import java.util.Set;

import edu.daw.mma.ProjectEventFight.DTO.EstadioDetallesDTO;
import edu.daw.mma.ProjectEventFight.model.Estadio;

public interface IEstadioService {

    public EstadioDetallesDTO insertarEstadio(Estadio estadio);

    public Set<EstadioDetallesDTO> listarEstadios();

    public EstadioDetallesDTO listarEstadioPorId(Long id);

    public EstadioDetallesDTO modificarEstadioPorId(Estadio estadio);

    public void eliminarEstadioPorId(Long id);
}
