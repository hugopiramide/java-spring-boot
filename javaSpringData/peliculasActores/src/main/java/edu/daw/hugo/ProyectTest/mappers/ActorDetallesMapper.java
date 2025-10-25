package edu.daw.hugo.ProyectTest.mappers;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import edu.daw.hugo.ProyectTest.DTO.ActorDetallesDTO;
import edu.daw.hugo.ProyectTest.model.Actor;

@Component
public class ActorDetallesMapper {

    public static ActorDetallesDTO toActorDetallesDTO(Actor actor) {
        ActorDetallesDTO dto = new ActorDetallesDTO();
        dto.setNombre(actor.getNombre());
        dto.setApellido(actor.getApellido());
        dto.setFechaNacimiento(actor.getFecha_nacimiento());
        dto.setOscarizado(actor.isOscarizado());
        dto.setActuaciones(actor.getActuaciones().stream()
                .map(ActuacionDetallesMapper::toActuacionDetallesDTO)
                .collect(Collectors.toSet()));
        return dto;
    }
}