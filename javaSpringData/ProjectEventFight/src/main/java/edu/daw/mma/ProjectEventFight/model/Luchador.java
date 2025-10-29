package edu.daw.mma.ProjectEventFight.model;

import java.time.LocalDate;
import java.util.List;

import edu.daw.mma.ProjectEventFight.model.enums.ArteMarcial;
import edu.daw.mma.ProjectEventFight.model.enums.Caracter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "luchador")
public class Luchador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long luchador_id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apodo", nullable = true)
    private String apodo;
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fecha_nacimiento;
    @Enumerated(EnumType.STRING)
    @Column(name = "caracter", nullable = true)
    private Caracter caracter;
    @Column(name = "arte_marical", nullable = true)
    private ArteMarcial arteMarcial;

    @OneToMany(mappedBy = "luchador1")
    private List<Pelea> peleasComoLuchador1;

    @OneToMany(mappedBy = "luchador2")
    private List<Pelea> peleasComoLuchador2;

    @OneToOne(mappedBy = "luchador")
    private Entrenador entrenador;

    public Luchador() {

    }

    public Long getLuchador_id() {
        return luchador_id;
    }

    public void setLuchador_id(Long luchador_id) {
        this.luchador_id = luchador_id;
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

    public List<Pelea> getPeleasComoLuchador1() {
        return peleasComoLuchador1;
    }

    public void setPeleasComoLuchador1(List<Pelea> peleasComoLuchador1) {
        this.peleasComoLuchador1 = peleasComoLuchador1;
    }

    public List<Pelea> getPeleasComoLuchador2() {
        return peleasComoLuchador2;
    }

    public void setPeleasComoLuchador2(List<Pelea> peleasComoLuchador2) {
        this.peleasComoLuchador2 = peleasComoLuchador2;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

}