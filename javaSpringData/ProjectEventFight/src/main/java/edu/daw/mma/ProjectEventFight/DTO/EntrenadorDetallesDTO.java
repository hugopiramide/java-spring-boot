package edu.daw.mma.ProjectEventFight.DTO;

import java.util.List;

public class EntrenadorDetallesDTO {

    private String nombre;
    private double comision;
    private double salario;
    private LuchadorResumenDTO luchador;
    private List<Contrato_luchador_entrenadorDetallesDTO> contratos_entrenador_luchador;

    public EntrenadorDetallesDTO() {

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

    public LuchadorResumenDTO getLuchador() {
        return luchador;
    }

    public void setLuchador(LuchadorResumenDTO luchador) {
        this.luchador = luchador;
    }

    public List<Contrato_luchador_entrenadorDetallesDTO> getContratos_entrenador_luchador() {
        return contratos_entrenador_luchador;
    }

    public void setContratos_entrenador_luchador(
            List<Contrato_luchador_entrenadorDetallesDTO> contratos_entrenador_luchador) {
        this.contratos_entrenador_luchador = contratos_entrenador_luchador;
    }

}