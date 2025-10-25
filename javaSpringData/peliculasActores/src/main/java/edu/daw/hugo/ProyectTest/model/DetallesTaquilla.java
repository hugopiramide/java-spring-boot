package edu.daw.hugo.ProyectTest.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "detalles_taquilla")
public class DetallesTaquilla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taquilla_id;
    @Column(name = "presupuesto", nullable = false)
    private BigDecimal presupuesto;
    @Column(name = "recaudacion", nullable = true)
    private BigDecimal recaudacion;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;

    public DetallesTaquilla() {

    }

    public DetallesTaquilla(Long taquilla_id, BigDecimal presupuesto, BigDecimal recaudacion, Pelicula pelicula) {
        this.taquilla_id = taquilla_id;
        this.presupuesto = presupuesto;
        this.recaudacion = recaudacion;
        this.pelicula = pelicula;
    }

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

    @Override
    public String toString() {
        return "DetallesTaquilla [taquilla_id=" + taquilla_id + ", presupuesto=" + presupuesto + ", recaudacion="
                + recaudacion + ", pelicula=" + pelicula + "]";
    }
}