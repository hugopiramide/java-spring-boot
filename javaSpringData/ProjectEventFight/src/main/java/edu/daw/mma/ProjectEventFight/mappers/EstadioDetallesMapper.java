package edu.daw.mma.ProjectEventFight.mappers;

import edu.daw.mma.ProjectEventFight.DTO.EstadioDetallesDTO;
import edu.daw.mma.ProjectEventFight.model.Estadio;

public class EstadioDetallesMapper {

    public static EstadioDetallesDTO toEstadioDetallesDTO(Estadio estadio) {
        EstadioDetallesDTO dto = new EstadioDetallesDTO();
        dto.setNombre(estadio.getNombre());
        dto.setAforo(estadio.getAforo());
        dto.setCiudad(estadio.getCiudad());
        dto.setPais(estadio.getPais());
        return dto;
    }

}
