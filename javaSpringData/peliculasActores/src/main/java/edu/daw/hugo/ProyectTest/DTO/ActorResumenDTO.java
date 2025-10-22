package edu.daw.hugo.ProyectTest.DTO;

public class ActorResumenDTO {
    private String nombre;
    private String apellido;

    public ActorResumenDTO() {

    }

    public ActorResumenDTO(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "ActorResumenDTO [nombre=" + nombre + ", apellidos=" + apellido + "]";
    }

}
