package edu.daw.mma.ProjectEventFight.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PeleaDetallesDTO {

    private LuchadorResumenDTO luchador1;
    private LuchadorResumenDTO luchador2;
    private EstadioDetallesDTO estadio;
    private BigDecimal taquilla;
    private LocalDate fecha_pelea;

    public PeleaDetallesDTO() {

    }

    public LuchadorResumenDTO getLuchador1() {
        return luchador1;
    }

    public void setLuchador1(LuchadorResumenDTO luchador1) {
        this.luchador1 = luchador1;
    }

    public LuchadorResumenDTO getLuchador2() {
        return luchador2;
    }

    public void setLuchador2(LuchadorResumenDTO luchador2) {
        this.luchador2 = luchador2;
    }

    public EstadioDetallesDTO getEstadio() {
        return estadio;
    }

    public void setEstadio(EstadioDetallesDTO estadio) {
        this.estadio = estadio;
    }

    public BigDecimal getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(BigDecimal taquilla) {
        this.taquilla = taquilla;
    }

    public LocalDate getFecha_pelea() {
        return fecha_pelea;
    }

    public void setFecha_pelea(LocalDate fecha_pelea) {
        this.fecha_pelea = fecha_pelea;
    }

}