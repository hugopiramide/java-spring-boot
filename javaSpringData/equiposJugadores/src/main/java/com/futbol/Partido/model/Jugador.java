package com.futbol.Partido.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jugadores")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jugador_id;
    private String nombre;
    private String apellidos;
    private LocalDate fecha_nacimiento;
    private String dorsal;
    private boolean balonDeOro;

    public Jugador() {
    }

    public Jugador(Long jugador_id, String nombre, String apellidos, LocalDate fecha_nacimiento, String dorsal,
            boolean balonDeOro) {
        this.jugador_id = jugador_id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dorsal = dorsal;
        this.balonDeOro = balonDeOro;
    }

    public Long getJugador_id() {
        return jugador_id;
    }

    public void setJugador_id(Long jugador_id) {
        this.jugador_id = jugador_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public boolean isBalonDeOro() {
        return balonDeOro;
    }

    public void setBalonDeOro(boolean balonDeOro) {
        this.balonDeOro = balonDeOro;
    }

    @Override
    public String toString() {
        return "Jugador [jugador_id=" + jugador_id + ", nombre=" + nombre + ", apellidos=" + apellidos
                + ", fecha_nacimiento=" + fecha_nacimiento + ", dorsal=" + dorsal + ", balonDeOro=" + balonDeOro + "]";
    }

}