package edu.daw.mma.ProjectEventFight.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estadio")
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estadio_id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "ciudad", nullable = false)
    private String ciudad;
    @Column(name = "pais", nullable = false)
    private String pais;
    @Column(name = "aforo", nullable = true)
    private Integer aforo;

    public Estadio() {

    }

    public Estadio(Long estadio_id, String nombre, String ciudad, String pais, Integer aforo) {
        this.estadio_id = estadio_id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.aforo = aforo;
    }

    public Estadio(String nombre, String ciudad, String pais, Integer aforo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.aforo = aforo;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer aforo) {
        this.aforo = aforo;
    }

}
