package edu.daw.hugo.ProyectTest.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import edu.daw.hugo.ProyectTest.model.enums.Genero;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pelicula_id;
    @Column(name = "titulo", nullable = false)
    private String titulo;
    @Enumerated(EnumType.STRING)
    @Column(name = "genero", nullable = true)
    private Genero genero;
    @Column(name = "duracion", nullable = false)
    private int duracion;
    @Column(name = "fecha_estreno", nullable = true)
    private LocalDate fecha_estreno;

    @OneToOne(mappedBy = "pelicula", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private DetallesTaquilla detallesTaquilla;

    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Critica> criticas;

    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Actuacion> actuaciones;

    public Pelicula() {
    }

    public Pelicula(String titulo, Genero genero, int duracion, LocalDate fecha_estreno) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.fecha_estreno = fecha_estreno;
    }

    public Pelicula(Long pelicula_id, String titulo, Genero genero, int duracion, LocalDate fecha_estreno) {
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(LocalDate fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public DetallesTaquilla getDetallesTaquilla() {
        return detallesTaquilla;
    }

    public void setDetallesTaquilla(DetallesTaquilla detallesTaquilla) {
        this.detallesTaquilla = detallesTaquilla;
    }

    public List<Critica> getCriticas() {
        return criticas;
    }

    public void setCriticas(List<Critica> criticas) {
        this.criticas = criticas;
    }

    public Set<Actuacion> getActuaciones() {
        return actuaciones;
    }

    public void setActuaciones(Set<Actuacion> actuaciones) {
        this.actuaciones = actuaciones;
    }

    @Override
    public String toString() {
        return "Pelicula [pelicula_id=" + pelicula_id + ", titulo=" + titulo + ", genero=" + genero + ", duracion="
                + duracion + ", fecha_estreno=" + fecha_estreno + ", detallesTaquilla=" + detallesTaquilla
                + ", criticas=" + criticas + ", actuaciones=" + actuaciones + "]";
    }

}