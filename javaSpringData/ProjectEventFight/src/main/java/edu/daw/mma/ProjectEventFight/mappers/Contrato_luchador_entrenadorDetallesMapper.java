package edu.daw.mma.ProjectEventFight.mappers;

import org.springframework.stereotype.Component;

import edu.daw.mma.ProjectEventFight.DTO.Contrato_luchador_entrenadorDetallesDTO;
import edu.daw.mma.ProjectEventFight.model.Contrato_luchador_entrenador;

@Component
public class Contrato_luchador_entrenadorDetallesMapper {

    public static Contrato_luchador_entrenadorDetallesDTO toContrato_luchador_entrenadorDetallesDTO(
            Contrato_luchador_entrenador contrato_luchador_entrenador) {
        Contrato_luchador_entrenadorDetallesDTO dto = new Contrato_luchador_entrenadorDetallesDTO();
        dto.setEntrenador(
                EntrenadorDetallesMapper.toEntrenadorDetallesDTO(contrato_luchador_entrenador.getEntrenador()));
        dto.setLuchador(LuchadorResumenMapper.toLuchadorResumenDTO(contrato_luchador_entrenador.getLuchador()));
        dto.setFechaInicio(contrato_luchador_entrenador.getFecha_inicio());
        dto.setFechaFin(contrato_luchador_entrenador.getFecha_fin());
        return dto;
    }

}
