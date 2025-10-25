package edu.daw.hugo.ProyectTest.model;

import java.time.LocalDate;

import edu.daw.hugo.ProyectTest.model.enums.Valoracion;
import jakarta.persistence.CascadeType;
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
@Table(name = "critica")
public class Critica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long critica_id;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Column(name = "autor", nullable = false)
    private String autor;
    @Column(name = "valoracion", nullable = false)
    private Valoracion valoracion;
    @Column(name = "cuerpo", nullable = true)
    private String cuerpo;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "pelicula_id", nullable = false)
    private Pelicula pelicula;

    public Critica() {

    }

    public Critica(LocalDate fecha, String autor, Valoracion valoracion, String cuerpo) {
        this.fecha = fecha;
        this.autor = autor;
        this.valoracion = valoracion;
        this.cuerpo = cuerpo;
    }

    public Critica(Long critica_id, LocalDate fecha, String autor, Valoracion valoracion, String cuerpo) {
        this.critica_id = critica_id;
        this.fecha = fecha;
        this.autor = autor;
        this.valoracion = valoracion;
        this.cuerpo = cuerpo;
    }

    public Long getCritica_id() {
        return critica_id;
    }

    public void setCritica_id(Long critica_id) {
        this.critica_id = critica_id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Critica [critica_id=" + critica_id + ", fecha=" + fecha + ", autor=" + autor + ", valoracion="
                + valoracion + ", cuerpo=" + cuerpo + ", pelicula=" + pelicula + "]";
    }

}