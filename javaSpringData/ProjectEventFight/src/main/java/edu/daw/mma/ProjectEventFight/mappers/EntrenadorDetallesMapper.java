package edu.daw.mma.ProjectEventFight.mappers;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import edu.daw.mma.ProjectEventFight.DTO.EntrenadorDetallesDTO;
import edu.daw.mma.ProjectEventFight.model.Entrenador;

@Component
public class EntrenadorDetallesMapper {

    public static EntrenadorDetallesDTO toEntrenadorDetallesDTO(Entrenador entrenador) {
        EntrenadorDetallesDTO dto = new EntrenadorDetallesDTO();
        dto.setNombre(entrenador.getNombre());
        dto.setComision(entrenador.getComision());
        dto.setSalario(entrenador.getSalario());
        dto.setLuchador(LuchadorResumenMapper.toLuchadorResumenDTO(entrenador.getLuchador()));
        dto.setContratos_entrenador_luchador(entrenador.getContratos_luchador_entrenador().stream()
                .map(Contrato_luchador_entrenadorDetallesMapper::toContrato_luchador_entrenadorDetallesDTO)
                .collect(Collectors.toList()));
        return dto;
    }

}
