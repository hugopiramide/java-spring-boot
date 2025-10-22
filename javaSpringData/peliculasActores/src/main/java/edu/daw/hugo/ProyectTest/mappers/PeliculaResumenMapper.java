package edu.daw.hugo.ProyectTest.mappers;

import org.springframework.stereotype.Component;

import edu.daw.hugo.ProyectTest.DTO.PeliculaResumenDTO;
import edu.daw.hugo.ProyectTest.model.Pelicula;

@Component
public class PeliculaResumenMapper {

    public static PeliculaResumenDTO toPeliculaResumenDTO(Pelicula pelicula) {

        PeliculaResumenDTO dto = new PeliculaResumenDTO();
        dto.setTitulo(pelicula.getTitulo());
        dto.setGenero(pelicula.getGenero());
        return dto;
    }
}
