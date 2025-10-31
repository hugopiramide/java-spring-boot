package edu.daw.mma.ProjectEventFight.services;

import java.util.Set;

import edu.daw.mma.ProjectEventFight.DTO.LuchadorDetallesDTO;
import edu.daw.mma.ProjectEventFight.model.Luchador;

public interface ILuchadorService {

    public LuchadorDetallesDTO insertarLuchador(Luchador luchador);

    public Set<LuchadorDetallesDTO> listarLuchadores();

    public LuchadorDetallesDTO listarLuchadorPorId(Long id);

    public LuchadorDetallesDTO modificarLuchadorPorId(Luchador luchador);

    public void eliminarLuchadorPorId(Long id);

}
