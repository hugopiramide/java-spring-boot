package edu.daw.hugo.ProyectTest.mappers;

import org.springframework.stereotype.Component;

import edu.daw.hugo.ProyectTest.DTO.ActorResumenDTO;
import edu.daw.hugo.ProyectTest.model.Actor;

@Component
public class ActorResumenMapper {

    public static ActorResumenDTO toActorResumenDTO(Actor actor) {
        ActorResumenDTO dto = new ActorResumenDTO();
        dto.setNombre(actor.getNombre());
        dto.setApellido(actor.getApellido());
        return dto;
    }
}
