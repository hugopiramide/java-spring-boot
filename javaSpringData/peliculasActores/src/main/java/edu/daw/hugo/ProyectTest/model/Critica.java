package edu.daw.hugo.ProyectTest.model;

import java.time.LocalDate;

import edu.daw.hugo.ProyectTest.model.enums.Valoracion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "criticas")
public class Critica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long critica_id;
    private LocalDate fecha;
    private String autor;
    private Valoracion valoracion;
    private String comentario;

    public Critica() {

    }

    public Critica(LocalDate fecha, String autor, Valoracion valoracion, String comentario) {
        this.fecha = fecha;
        this.autor = autor;
        this.valoracion = valoracion;
        this.comentario = comentario;
    }

    public Critica(Long critica_id, LocalDate fecha, String autor, Valoracion valoracion, String comentario) {
        this.critica_id = critica_id;
        this.fecha = fecha;
        this.autor = autor;
        this.valoracion = valoracion;
        this.comentario = comentario;
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Critica [criticas_id=" + critica_id + ", fecha=" + fecha + ", autor=" + autor + ", valoracion="
                + valoracion + ", comentario=" + comentario + "]";
    }

}