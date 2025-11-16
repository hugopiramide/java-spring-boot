package edu.hugo.back.BibliotecaPersonal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long autor_id;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "apellido_1", nullable = false, length = 100)
    private String apellido1;
    @Column(name = "apellido_2", nullable = true, length = 100)
    private String apellido2;
    @Column(name = "nacionalidad", nullable = false, length = 50)
    private String nacionalidad;
}
