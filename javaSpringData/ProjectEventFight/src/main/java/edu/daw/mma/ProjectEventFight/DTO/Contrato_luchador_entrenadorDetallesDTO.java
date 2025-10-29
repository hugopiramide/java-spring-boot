package edu.daw.mma.ProjectEventFight.DTO;

import java.time.LocalDate;

public class Contrato_luchador_entrenadorDetallesDTO {

    private EntrenadorDetallesDTO entrenador;
    private LuchadorResumenDTO luchador;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Contrato_luchador_entrenadorDetallesDTO() {

    }

    public EntrenadorDetallesDTO getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(EntrenadorDetallesDTO entrenador) {
        this.entrenador = entrenador;
    }

    public LuchadorResumenDTO getLuchador() {
        return luchador;
    }

    public void setLuchador(LuchadorResumenDTO luchador) {
        this.luchador = luchador;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

}
