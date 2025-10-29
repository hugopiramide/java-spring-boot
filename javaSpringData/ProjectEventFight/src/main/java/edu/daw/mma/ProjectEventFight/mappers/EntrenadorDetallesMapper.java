package edu.daw.mma.ProjectEventFight.mappers;

import edu.daw.mma.ProjectEventFight.DTO.EntrenadorDetallesDTO;
import edu.daw.mma.ProjectEventFight.model.Entrenador;

public class EntrenadorDetallesMapper {

    public static EntrenadorDetallesDTO toEntrenadorDetallesDTO(Entrenador entrenador) {
        EntrenadorDetallesDTO dto = new EntrenadorDetallesDTO();
        dto.setNombre(entrenador.getNombre());
        dto.setComision(entrenador.getComision());
        dto.setSalario(entrenador.getSalario());
        dto.setLuchador(LuchadorResumenMapper.toLuchadorResumenDTO(entrenador.getLuchador()));
        dto.setContrato_entrenador_luchador(Contrato_luchador_entrenadorDetallesMapper
                .toContrato_luchador_entrenadorDetallesDTO(entrenador.getContrato_entrenador_luchador()));
        return dto;
    }

}
