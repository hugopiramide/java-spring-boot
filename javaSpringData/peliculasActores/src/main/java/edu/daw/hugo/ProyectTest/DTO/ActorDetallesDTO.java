package edu.daw.hugo.ProyectTest.DTO;

import java.time.LocalDate;
import java.util.Set;

public class ActorDetallesDTO {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private boolean oscarizado;
    private Set<PeliculaResumenDTO> peliculas;

    public ActorDetallesDTO() {

    }

    public ActorDetallesDTO(String nombre, String apellido, LocalDate fechaNacimiento, boolean oscarizado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.oscarizado = oscarizado;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isOscarizado() {
        return oscarizado;
    }

    public void setOscarizado(boolean oscarizado) {
        this.oscarizado = oscarizado;
    }

    public Set<PeliculaResumenDTO> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Set<PeliculaResumenDTO> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "ActorDetallesDTO [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
                + ", oscarizado=" + oscarizado + ", peliculas=" + peliculas + "]";
    }

}
