package edu.daw.mma.ProjectEventFight.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "entrenador")
public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entrenador_id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "comison", nullable = true)
    private double comision;
    @Column(name = "salario", nullable = true)
    private double salario;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "luchador_id")
    private Luchador luchador;

    @OneToMany(mappedBy = "entrenador")
    private Contrato_luchador_entrenador contrato_entrenador_luchador;

    public Entrenador() {

    }

    public Entrenador(Long entrenador_id, String nombre, double comision, double salario) {
        this.entrenador_id = entrenador_id;
        this.nombre = nombre;
        this.comision = comision;
        this.salario = salario;
    }

    public Entrenador(String nombre, double comision, double salario) {
        this.nombre = nombre;
        this.comision = comision;
        this.salario = salario;
    }

    public Long getEntrenador_id() {
        return entrenador_id;
    }

    public void setEntrenador_id(Long entrenador_id) {
        this.entrenador_id = entrenador_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Luchador getLuchador() {
        return luchador;
    }

    public void setLuchador(Luchador luchador) {
        this.luchador = luchador;
    }

}
