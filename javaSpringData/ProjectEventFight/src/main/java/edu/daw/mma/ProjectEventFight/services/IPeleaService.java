package edu.daw.mma.ProjectEventFight.services;

import java.util.List;

import edu.daw.mma.ProjectEventFight.DTO.PeleaDetallesDTO;
import edu.daw.mma.ProjectEventFight.model.Pelea;

public interface IPeleaService {

    public PeleaDetallesDTO insertarPelea(Pelea pelea);

    public List<PeleaDetallesDTO> listarPeleas();

    public PeleaDetallesDTO listarPeleaPorId(Long id);

    public PeleaDetallesDTO modificarPeleaPorId(Pelea pelea);

    public void eleminarPeleaPorId(Long id);

}
