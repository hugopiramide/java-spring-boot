package edu.hugo.back.BibliotecaPersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hugo.back.BibliotecaPersonal.model.Autor;

public interface IAutorRepository extends JpaRepository<Autor, Long> {
}
