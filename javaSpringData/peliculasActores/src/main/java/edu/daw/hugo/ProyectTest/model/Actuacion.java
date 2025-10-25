package edu.daw.hugo.ProyectTest.model;

import java.math.BigDecimal;

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
@Table(name = "actuacion")
public class Actuacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actuacion_id;
    @Column(name = "salario", nullable = true)
    private BigDecimal salario;
    @Column(name = "es_protagonista", nullable = true)
    private boolean protagonista;
    @Column(name = "idioma", nullable = true)
    private String idioma;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "actor_id", nullable = false)
    private Actor actor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pelicula_id", nullable = false)
    private Pelicula pelicula;

    public Actuacion() {

    }

    public Actuacion(Long actuacion_id, Actor actor, Pelicula pelicula, BigDecimal salario, boolean protagonista,
            String idioma) {
        this.actuacion_id = actuacion_id;
        this.actor = actor;
        this.pelicula = pelicula;
        this.salario = salario;
        this.protagonista = protagonista;
        this.idioma = idioma;
    }

    public Actuacion(Actor actor, Pelicula pelicula, BigDecimal salario, boolean protagonista, String idioma) {
        this.actor = actor;
        this.pelicula = pelicula;
        this.salario = salario;
        this.protagonista = protagonista;
        this.idioma = idioma;
    }

    public Long getActuacion_id() {
        return actuacion_id;
    }

    public void setActuacion_id(Long actuacion_id) {
        this.actuacion_id = actuacion_id;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
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

    @Override
    public String toString() {
        return "Actuacion [actuacion_id=" + actuacion_id + ", actor=" + actor + ", pelicula=" + pelicula + ", salario="
                + salario + ", protagonista=" + protagonista + ", idioma=" + idioma + "]";
    }

}
