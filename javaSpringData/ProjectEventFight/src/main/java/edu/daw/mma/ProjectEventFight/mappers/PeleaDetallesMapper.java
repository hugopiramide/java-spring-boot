package edu.daw.mma.ProjectEventFight.mappers;

import edu.daw.mma.ProjectEventFight.DTO.PeleaDetallesDTO;
import edu.daw.mma.ProjectEventFight.model.Pelea;

public class PeleaDetallesMapper {

    public static PeleaDetallesDTO toPeleaDetallesDTO(Pelea pelea) {
        PeleaDetallesDTO dto = new PeleaDetallesDTO();
        dto.setEstadio(EstadioDetallesMapper.toEstadioDetallesDTO(pelea.getEstadio()));
        dto.setTaquilla(pelea.getTaquilla());
        dto.setFecha_pelea(pelea.getFecha_pelea());
        dto.setLuchador1(LuchadorResumenMapper.toLuchadorResumenDTO(pelea.getLuchador1()));
        dto.setLuchador2(LuchadorResumenMapper.toLuchadorResumenDTO(pelea.getLuchador2()));
        return dto;
    }

}
