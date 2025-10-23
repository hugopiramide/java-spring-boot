package edu.daw.hugo.ProyectTest.mappers;

import org.springframework.stereotype.Component;

import edu.daw.hugo.ProyectTest.DTO.CriticaDetallesDTO;
import edu.daw.hugo.ProyectTest.model.Critica;

@Component
public class CriticaDetallesMapper {

    public static CriticaDetallesDTO toCriticaDetallesDTO(Critica critica) {
        CriticaDetallesDTO dto = new CriticaDetallesDTO();
        dto.setFecha(critica.getFecha());
        dto.setAutor(critica.getAutor());
        dto.setValoracion(critica.getValoracion());
        dto.setCuerpo(critica.getCuerpo());
        dto.setPelicula(PeliculaResumenMapper.toPeliculaResumenDTO(critica.getPelicula()));
        return dto;
    }
}