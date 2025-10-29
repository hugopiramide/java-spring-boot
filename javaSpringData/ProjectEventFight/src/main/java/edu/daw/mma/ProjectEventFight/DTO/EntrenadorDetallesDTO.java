package edu.daw.mma.ProjectEventFight.DTO;

public class EntrenadorDetallesDTO {

    private String nombre;
    private double comision;
    private double salario;
    private LuchadorResumenDTO luchador;
    private Contrato_luchador_entrenadorDetallesDTO contrato_entrenador_luchador;

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

    public Contrato_luchador_entrenadorDetallesDTO getContrato_entrenador_luchador() {
        return contrato_entrenador_luchador;
    }

    public void setContrato_entrenador_luchador(Contrato_luchador_entrenadorDetallesDTO contrato_entrenador_luchador) {
        this.contrato_entrenador_luchador = contrato_entrenador_luchador;
    }

}