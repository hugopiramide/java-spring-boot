package edu.daw.mma.ProjectEventFight.DTO;

public class EntrenadorResumenDTO {
    private String nombre;
    private double comision;
    private double salario;

    public EntrenadorResumenDTO() {

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

}
