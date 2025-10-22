package edu.daw.hugo.ProyectTest.DTO;

import edu.daw.hugo.ProyectTest.model.enums.Genero;

public class PeliculaResumenDTO {
    private String titulo;
    private Genero genero;

    public PeliculaResumenDTO() {

    }

    public PeliculaResumenDTO(String titulo, Genero genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
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

    @Override
    public String toString() {
        return "PeliculaResumenDTO [titulo=" + titulo + ", genero=" + genero + "]";
    }
}
