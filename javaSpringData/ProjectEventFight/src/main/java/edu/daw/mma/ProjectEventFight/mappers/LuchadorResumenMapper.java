package edu.daw.mma.ProjectEventFight.mappers;

import edu.daw.mma.ProjectEventFight.DTO.LuchadorResumenDTO;
import edu.daw.mma.ProjectEventFight.model.Luchador;

public class LuchadorResumenMapper {

    public static LuchadorResumenDTO toLuchadorResumenDTO(Luchador luchador) {
        LuchadorResumenDTO dto = new LuchadorResumenDTO();
        dto.setApodo(luchador.getApodo());
        dto.setArteMarcial(luchador.getArteMarcial());
        dto.setCaracter(luchador.getCaracter());
        dto.setNombre(luchador.getNombre());
        dto.setFecha_nacimiento(luchador.getFecha_nacimiento());
        return dto;

    }
}
