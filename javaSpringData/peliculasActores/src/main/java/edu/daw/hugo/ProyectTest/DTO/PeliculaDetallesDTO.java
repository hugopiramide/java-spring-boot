package edu.daw.hugo.ProyectTest.DTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import edu.daw.hugo.ProyectTest.model.enums.Genero;

public class PeliculaDetallesDTO {
    private String titulo;
    private Genero genero;
    private int duracion;
    private LocalDate fechaEstreno;
    private Set<ActorResumenDTO> actores;
    private List<CriticaDetallesDTO> criticas;

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

    public Set<ActorResumenDTO> getActores() {
        return actores;
    }

    public void setActores(Set<ActorResumenDTO> actores) {
        this.actores = actores;
    }

    public List<CriticaDetallesDTO> getCriticas() {
        return criticas;
    }

    public void setCriticas(List<CriticaDetallesDTO> criticas) {
        this.criticas = criticas;
    }

    @Override
    public String toString() {
        return "PeliculaDetallesDTO [titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion
                + ", fechaEstreno=" + fechaEstreno + ", actores=" + actores + ", criticas=" + criticas + "]";
    }

}
