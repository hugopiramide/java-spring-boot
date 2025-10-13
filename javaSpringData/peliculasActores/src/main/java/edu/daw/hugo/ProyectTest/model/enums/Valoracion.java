package edu.daw.hugo.ProyectTest.model.enums;

public enum Valoracion {
    UNO("1"),
    DOS("2"),
    TRES("3"),
    CUATRO("4"),
    CINCO("5");

    private final String valorEnBBDD;

    Valoracion(String valor) {
        this.valorEnBBDD = valor;
    }

    @JsonValue
    public String getValorEnBBDD() {
        return valorEnBBDD;
    }

    public static Valoracion fromValorEnBBDD(String valor) {
        for (Valoracion v : values()) {
            if (v.valorEnBBDD.equals(valor)) {
                return v;
            }
        }
        throw new IllegalArgumentException("Valoracion desconocida: " + valor);
    }

}