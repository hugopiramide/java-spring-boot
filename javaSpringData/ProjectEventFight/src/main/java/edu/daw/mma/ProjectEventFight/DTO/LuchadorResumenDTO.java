package edu.daw.mma.ProjectEventFight.DTO;

import java.time.LocalDate;

import edu.daw.mma.ProjectEventFight.model.enums.ArteMarcial;
import edu.daw.mma.ProjectEventFight.model.enums.Caracter;

public class LuchadorResumenDTO {

    private String nombre;
    private String apodo;
    private LocalDate fecha_nacimiento;
    private Caracter caracter;
    private ArteMarcial arteMarcial;

    public LuchadorResumenDTO() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Caracter getCaracter() {
        return caracter;
    }

    public void setCaracter(Caracter caracter) {
        this.caracter = caracter;
    }

    public ArteMarcial getArteMarcial() {
        return arteMarcial;
    }

    public void setArteMarcial(ArteMarcial arteMarcial) {
        this.arteMarcial = arteMarcial;
    }

    @Override
    public String toString() {
        return "LuchadorResumenDTO [nombre=" + nombre + ", apodo=" + apodo + ", fecha_nacimiento=" + fecha_nacimiento
                + ", caracter=" + caracter + ", arteMarcial=" + arteMarcial + "]";
    }

}
