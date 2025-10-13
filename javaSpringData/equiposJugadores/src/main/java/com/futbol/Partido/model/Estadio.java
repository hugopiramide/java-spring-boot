package com.futbol.Partido.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estadios")
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estadio_id;
    private String nombre;
    private String ubicacion;
    private int aforoMaximo;
    private String color;

    public Estadio() {

    }

    public Estadio(Long estadio_id, String nombre, String ubicacion, int aforoMaximo, String color) {
        this.estadio_id = estadio_id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.aforoMaximo = aforoMaximo;
        this.color = color;
    }

    public Long getEstadio_id() {
        return estadio_id;
    }

    public void setEstadio_id(Long estadio_id) {
        this.estadio_id = estadio_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Estadio [estadio_id=" + estadio_id + ", nombre=" + nombre + ", ubicacion=" + ubicacion
                + ", aforoMaximo=" + aforoMaximo + ", color=" + color + "]";
    }

}
