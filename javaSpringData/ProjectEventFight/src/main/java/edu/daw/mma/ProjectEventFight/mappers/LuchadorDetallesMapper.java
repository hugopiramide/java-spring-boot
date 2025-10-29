package edu.daw.mma.ProjectEventFight.mappers;

import java.util.stream.Collectors;

import edu.daw.mma.ProjectEventFight.DTO.LuchadorDetallesDTO;
import edu.daw.mma.ProjectEventFight.model.Luchador;

public class LuchadorDetallesMapper {

    public static LuchadorDetallesDTO toLuchadorDetallesDTO(Luchador luchador) {
        LuchadorDetallesDTO dto = new LuchadorDetallesDTO();
        dto.setNombre(luchador.getNombre());
        dto.setApodo(luchador.getApodo());
        dto.setFecha_nacimiento(luchador.getFecha_nacimiento());
        dto.setArteMarcial(luchador.getArteMarcial());
        dto.setCaracter(luchador.getCaracter());
        dto.setEntrenador(EntrenadorDetallesMapper.toEntrenadorDetallesDTO(luchador.getEntrenador()));
        dto.setContrato_luchador_entrenador(
                Contrato_luchador_entrenadorDetallesMapper
                        .toContrato_luchador_entrenadorDetallesDTO(luchador.getContrato_luchador_entrenador()));
        dto.setPeleasComoLuchador1(luchador.getPeleasComoLuchador1().stream()
                .map(PeleaDetallesMapper::toPeleaDetallesDTO)
                .collect(Collectors.toList()));
        dto.setPeleasComoLuchador2(luchador.getPeleasComoLuchador2().stream()
                .map(PeleaDetallesMapper::toPeleaDetallesDTO)
                .collect(Collectors.toList()));
        return dto;
    }
}
