package edu.hugo.back.BibliotecaPersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hugo.back.BibliotecaPersonal.model.Libro;

public interface ILibroRepository extends JpaRepository<Libro, Long> {

}
