package edu.daw.mma.ProjectEventFight.services;

import java.util.List;
import java.util.Set;

import edu.daw.mma.ProjectEventFight.DTO.LuchadorResumenDTO;
import edu.daw.mma.ProjectEventFight.model.Luchador;

public interface ILuchadorService {

    public LuchadorResumenDTO insertarLuchador(Luchador luchador);

    public Set<LuchadorResumenDTO> listarLuchadores();

    public LuchadorResumenDTO listarLuchadorPorId(Long id);

    public LuchadorResumenDTO modificarLuchadorPorId(Luchador luchador);

    public void eliminarLuchadorPorId(Long id);

    public List<LuchadorResumenDTO> buscarLuchadoresPorNombre(String nombre);
}
