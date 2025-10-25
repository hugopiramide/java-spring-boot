package edu.daw.hugo.ProyectTest.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actor_id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = true)
    private String apellido;
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fecha_nacimiento;
    @Column(name = "oscarizado", nullable = true)
    private boolean oscarizado;

    // @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    // @JoinTable(name = "actores_peliculas", joinColumns = @JoinColumn(name =
    // "actor_id", nullable = false), inverseJoinColumns = @JoinColumn(name =
    // "pelicula_id", nullable = false))
    // private Set<Pelicula> peliculas;

    @OneToMany(mappedBy = "actor", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Actuacion> actuaciones;

    public Actor() {
    }

    public Actor(String nombre, String apellido, LocalDate fecha_nacimiento, boolean oscarizado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.oscarizado = oscarizado;
    }

    public Actor(Long actor_id, String nombre, String apellido, LocalDate fecha_nacimiento, boolean oscarizado) {
        this.actor_id = actor_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.oscarizado = oscarizado;
    }

    public Long getActor_id() {
        return actor_id;
    }

    public void setActor_id(Long actor_id) {
        this.actor_id = actor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public boolean isOscarizado() {
        return oscarizado;
    }

    public void setOscarizado(boolean oscarizado) {
        this.oscarizado = oscarizado;
    }

    public Set<Actuacion> getActuaciones() {
        return actuaciones;
    }

    public void setActuaciones(Set<Actuacion> actuaciones) {
        this.actuaciones = actuaciones;
    }

    @Override
    public String toString() {
        return "Actor [actor_id=" + actor_id + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_nacimiento="
                + fecha_nacimiento + ", oscarizado=" + oscarizado + ", actuaciones=" + actuaciones + "]";
    }
}