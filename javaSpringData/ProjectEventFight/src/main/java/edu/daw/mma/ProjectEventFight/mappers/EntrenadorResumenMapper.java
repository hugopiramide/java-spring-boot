package edu.daw.mma.ProjectEventFight.mappers;

import edu.daw.mma.ProjectEventFight.DTO.EntrenadorResumenDTO;
import edu.daw.mma.ProjectEventFight.model.Entrenador;

public class EntrenadorResumenMapper {

    public static EntrenadorResumenDTO toEntrenadorResumenDTO(Entrenador entrenador) {
        EntrenadorResumenDTO dto = new EntrenadorResumenDTO();
        dto.setNombre(entrenador.getNombre());
        dto.setComision(entrenador.getComision());
        dto.setSalario(entrenador.getSalario());
        return dto;
    }
}
