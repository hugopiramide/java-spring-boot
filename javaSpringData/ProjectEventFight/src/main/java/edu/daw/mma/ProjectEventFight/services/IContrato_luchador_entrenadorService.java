package edu.daw.mma.ProjectEventFight.services;

import java.util.List;

import edu.daw.mma.ProjectEventFight.DTO.Contrato_luchador_entrenadorDetallesDTO;
import edu.daw.mma.ProjectEventFight.model.Contrato_luchador_entrenador;

public interface IContrato_luchador_entrenadorService {

    public Contrato_luchador_entrenadorDetallesDTO inserContrato_luchador_entrenador(
            Contrato_luchador_entrenador contrato_luchador_entrenador);

    public List<Contrato_luchador_entrenadorDetallesDTO> listarContratos_luchador_entrenador();

    public Contrato_luchador_entrenadorDetallesDTO listaContrato_luchador_entrenadorPorId(Long id);

    public Contrato_luchador_entrenadorDetallesDTO modificarContrato_luchador_entrenador(
            Contrato_luchador_entrenador contrato_luchador_entrenador);

    public void eliminarContrato_luchador_entrenadorPorId(Long id);
}
