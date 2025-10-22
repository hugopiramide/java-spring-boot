package edu.daw.hugo.ProyectTest.mappers;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import edu.daw.hugo.ProyectTest.mappers.ActorResumenMapper;
import edu.daw.hugo.ProyectTest.DTO.PeliculaDetallesDTO;
import edu.daw.hugo.ProyectTest.model.Pelicula;

@Component
public class PeliculaDetallesMapper {

    public static PeliculaDetallesDTO toPeliculaDetallesDTO(Pelicula pelicula) {
        PeliculaDetallesDTO dto = new PeliculaDetallesDTO();
        dto.setTitulo(pelicula.getTitulo());
        dto.setGenero(pelicula.getGenero());
        dto.setDuracion(pelicula.getDuracion());
        dto.setFechaEstreno(pelicula.getFecha_estreno());
        dto.setActores(pelicula.getActores().stream()
                .map(ActorResumenMapper::toActorResumenDTO)
                .collect(Collectors.toSet()));
        dto.setCriticas(pelicula.getCriticas().stream()
                .map(::toCriticaDetalleDTO)
                .collect(Collectors.toList()));
        return dto;
    }

}
