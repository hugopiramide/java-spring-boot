package edu.daw.hugo.ProyectTest.model;

import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import edu.daw.hugo.ProyectTest.model.enums.Genero;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pelicula_id;
    private String titulo;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    private String duracion;
    private String fecha_estreno;

    // Bucle Infinito
    @ManyToMany(mappedBy = "peliculas")
    private Set<Actor> actores;

    @OneToOne(mappedBy = "pelicula", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Detalles_taquilla detalles_taquilla;

    public Pelicula() {
    }

    public Pelicula(String titulo, Genero genero, String duracion, String fecha_estreno) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.fecha_estreno = fecha_estreno;
    }

    public Pelicula(Long pelicula_id, String titulo, Genero genero, String duracion, String fecha_estreno) {
        this.pelicula_id = pelicula_id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.fecha_estreno = fecha_estreno;
    }

    public Long getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(Long pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    @Override
    public String toString() {
        return "Pelicula [pelicula_id=" + pelicula_id + ", titulo=" + titulo + ", genero=" + genero + ", duracion="
                + duracion + ", fecha_estreno=" + fecha_estreno + "]";
    }

}