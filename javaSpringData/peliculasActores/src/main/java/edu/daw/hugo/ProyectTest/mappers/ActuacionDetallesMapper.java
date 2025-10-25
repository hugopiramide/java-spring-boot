package edu.daw.hugo.ProyectTest.mappers;

import org.springframework.stereotype.Component;

import edu.daw.hugo.ProyectTest.DTO.ActuacionDetallesDTO;
import edu.daw.hugo.ProyectTest.model.Actuacion;

@Component
public class ActuacionDetallesMapper {

    public static ActuacionDetallesDTO toActuacionDetallesDTO(Actuacion actuacion) {
        ActuacionDetallesDTO dto = new ActuacionDetallesDTO();
        dto.setSalario(actuacion.getSalario());
        dto.setProtagonista(actuacion.isProtagonista());
        dto.setIdioma(actuacion.getIdioma());
        dto.setActor(ActorResumenMapper.toActorResumenDTO(actuacion.getActor()));
        dto.setPelicula(PeliculaResumenMapper.toPeliculaResumenDTO(actuacion.getPelicula()));
        return dto;
    }
}
