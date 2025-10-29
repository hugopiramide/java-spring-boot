package edu.daw.mma.ProjectEventFight.model;

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
@Table(name = "contrato_luchador_entrenador")
public class Contrato_luchador_entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contrato_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entrenador_id")
    private Entrenador entrenador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "luchador_id")
    private Luchador luchador;

    @Column(name = "fecha_inicio")
    private LocalDate fecha_inicio;
    @Column(name = "fecha_fin")
    private LocalDate fecha_fin;

    public Contrato_luchador_entrenador() {

    }

    public Contrato_luchador_entrenador(Long contrato_id, Entrenador entrenador, Luchador luchador,
            LocalDate fecha_inicio, LocalDate fecha_fin) {
        this.contrato_id = contrato_id;
        this.entrenador = entrenador;
        this.luchador = luchador;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Luchador getLuchador() {
        return luchador;
    }

    public void setLuchador(Luchador luchador) {
        this.luchador = luchador;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Long getContrato_id() {
        return contrato_id;
    }

    public void setContrato_id(Long contrato_id) {
        this.contrato_id = contrato_id;
    }

}
