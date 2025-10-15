package edu.daw.hugo.ProyectTest.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "detalles_taquilla")
public class Detalles_taquilla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taquilla_id;
    private BigDecimal presupuesto;
    private BigDecimal recaudacion;

    public Detalles_taquilla() {

    }

    public Detalles_taquilla(Long taquilla_id, BigDecimal presupuesto, BigDecimal recaudacion, Pelicula pelicula) {
        this.taquilla_id = taquilla_id;
        this.presupuesto = presupuesto;
        this.recaudacion = recaudacion;
        this.pelicula = pelicula;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;

    public Long getTaquilla_id() {
        return taquilla_id;
    }

    public void setTaquilla_id(Long taquilla_id) {
        this.taquilla_id = taquilla_id;
    }

    public BigDecimal getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(BigDecimal presupuesto) {
        this.presupuesto = presupuesto;
    }

    public BigDecimal getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

}