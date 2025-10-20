package edu.daw.hugo.ProyectTest.model.DTO;

import java.time.LocalDate;

import edu.daw.hugo.ProyectTest.model.enums.Valoracion;

public class CriticaDetallesDTO {
    private LocalDate fecha;
    private String auto;
    private Valoracion valoracion;
    private String cuerpo;
    private PeliculaResumenDTO pelicula;

    public CriticaDetallesDTO() {

    }

    public CriticaDetallesDTO(LocalDate fecha, String auto, Valoracion valoracion, String cuerpo) {
        this.fecha = fecha;
        this.auto = auto;
        this.valoracion = valoracion;
        this.cuerpo = cuerpo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public Valoracion getValoracion() {
        return valoracion;
    }

    public void setValoracion(Valoracion valoracion) {
        this.valoracion = valoracion;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

}
