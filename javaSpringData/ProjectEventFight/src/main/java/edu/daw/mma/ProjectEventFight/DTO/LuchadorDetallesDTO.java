package edu.daw.mma.ProjectEventFight.DTO;

import java.time.LocalDate;
import java.util.List;

import edu.daw.mma.ProjectEventFight.model.enums.ArteMarcial;
import edu.daw.mma.ProjectEventFight.model.enums.Caracter;

public class LuchadorDetallesDTO {

    private String nombre;
    private String apodo;
    private LocalDate fecha_nacimiento;
    private Caracter caracter;
    private ArteMarcial arteMarcial;
    private List<PeleaDetallesDTO> peleasComoLuchador1;
    private List<PeleaDetallesDTO> peleasComoLuchador2;
    private EntrenadorDetallesDTO entrenador;
    private Contrato_luchador_entrenadorDetallesDTO contrato_luchador_entrenador;

    public LuchadorDetallesDTO() {

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

    public List<PeleaDetallesDTO> getPeleasComoLuchador1() {
        return peleasComoLuchador1;
    }

    public void setPeleasComoLuchador1(List<PeleaDetallesDTO> peleasComoLuchador1) {
        this.peleasComoLuchador1 = peleasComoLuchador1;
    }

    public List<PeleaDetallesDTO> getPeleasComoLuchador2() {
        return peleasComoLuchador2;
    }

    public void setPeleasComoLuchador2(List<PeleaDetallesDTO> peleasComoLuchador2) {
        this.peleasComoLuchador2 = peleasComoLuchador2;
    }

    public EntrenadorDetallesDTO getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(EntrenadorDetallesDTO entrenador) {
        this.entrenador = entrenador;
    }

    public Contrato_luchador_entrenadorDetallesDTO getContrato_luchador_entrenador() {
        return contrato_luchador_entrenador;
    }

    public void setContrato_luchador_entrenador(Contrato_luchador_entrenadorDetallesDTO contrato_luchador_entrenador) {
        this.contrato_luchador_entrenador = contrato_luchador_entrenador;
    }

}
