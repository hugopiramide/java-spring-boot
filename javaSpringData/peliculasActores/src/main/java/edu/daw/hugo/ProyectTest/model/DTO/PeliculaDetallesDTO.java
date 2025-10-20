package edu.daw.hugo.ProyectTest.model.DTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import edu.daw.hugo.ProyectTest.model.enums.Genero;

public class PeliculaDetallesDTO {
    private String titulo;
    private Genero genero;
    private int duracion;
    private LocalDate fechaEstreno;
    private Set<ActorResumenDTO> setActores;
    private List<CriticaDetallesDTO> listCriticas;

    public PeliculaDetallesDTO() {

    }

    public String getTitulo() {
        return titulo;
    }

    public PeliculaDetallesDTO(String titulo, Genero genero, int duracion, LocalDate fechaEstreno) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.fechaEstreno = fechaEstreno;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

}
