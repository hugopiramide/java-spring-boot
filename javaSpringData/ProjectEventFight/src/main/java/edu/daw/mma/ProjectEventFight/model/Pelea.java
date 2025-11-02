package edu.daw.mma.ProjectEventFight.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelea")
public class Pelea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pelea_id;

    @ManyToOne
    @JoinColumn(name = "luchador1_id")
    private Luchador luchador1;

    @ManyToOne
    @JoinColumn(name = "luchador2_id")
    private Luchador luchador2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estadio_id")
    private Estadio estadio;

    @Column(name = "taquilla", nullable = true)
    private BigDecimal taquilla;
    @Column(name = "fecha_pelea", nullable = true)
    private LocalDate fecha_pelea;

    public Pelea() {

    }

    public Pelea(Long pelea_id, Luchador luchador1, Luchador luchador2, Estadio estadio, BigDecimal taquilla,
            LocalDate fecha_pelea) {
        this.pelea_id = pelea_id;
        this.luchador1 = luchador1;
        this.luchador2 = luchador2;
        this.estadio = estadio;
        this.taquilla = taquilla;
        this.fecha_pelea = fecha_pelea;
    }

    public Pelea(Luchador luchador1, Luchador luchador2, Estadio estadio, BigDecimal taquilla, LocalDate fecha_pelea) {
        this.luchador1 = luchador1;
        this.luchador2 = luchador2;
        this.estadio = estadio;
        this.taquilla = taquilla;
        this.fecha_pelea = fecha_pelea;
    }

    public Long getPelea_id() {
        return pelea_id;
    }

    public void setPelea_id(Long pelea_id) {
        this.pelea_id = pelea_id;
    }

    public Luchador getLuchador1() {
        return luchador1;
    }

    public void setLuchador1(Luchador luchador1) {
        this.luchador1 = luchador1;
    }

    public Luchador getLuchador2() {
        return luchador2;
    }

    public void setLuchador2(Luchador luchador2) {
        this.luchador2 = luchador2;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
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
