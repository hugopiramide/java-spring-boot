package com.futbol.Partido.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipos")
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipo_id;
    private String nombre;
    private String apodo;

    public Equipo() {

    }

    public Equipo(Long equipo_id, String nombre, String apodo) {
        this.equipo_id = equipo_id;
        this.nombre = nombre;
        this.apodo = apodo;
    }

    public Long getEquipo_id() {
        return equipo_id;
    }

    public void setEquipo_id(Long equipo_id) {
        this.equipo_id = equipo_id;
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

    @Override
    public String toString() {
        return "Equipo [equipo_id=" + equipo_id + ", nombre=" + nombre + ", apodo=" + apodo + "]";
    }

}
