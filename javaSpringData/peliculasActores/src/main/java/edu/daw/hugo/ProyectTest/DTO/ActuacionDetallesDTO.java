package edu.daw.hugo.ProyectTest.DTO;

import java.math.BigDecimal;

public class ActuacionDetallesDTO {

    private BigDecimal salario;
    private boolean protagonista;
    private String idioma;
    private ActorResumenDTO actor;
    private PeliculaResumenDTO pelicula;

    public ActuacionDetallesDTO() {
    }

    public ActuacionDetallesDTO(BigDecimal salario, boolean protagonista, String idioma, ActorResumenDTO actor,
            PeliculaResumenDTO pelicula) {
        this.salario = salario;
        this.protagonista = protagonista;
        this.idioma = idioma;
        this.actor = actor;
        this.pelicula = pelicula;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public boolean isProtagonista() {
        return protagonista;
    }

    public void setProtagonista(boolean protagonista) {
        this.protagonista = protagonista;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ActorResumenDTO getActor() {
        return actor;
    }

    public void setActor(ActorResumenDTO actor) {
        this.actor = actor;
    }

    public PeliculaResumenDTO getPelicula() {
        return pelicula;
    }

    public void setPelicula(PeliculaResumenDTO pelicula) {
        this.pelicula = pelicula;
    }

}
