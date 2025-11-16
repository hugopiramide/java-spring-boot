package edu.hugo.back.BibliotecaPersonal.service.interfaces;

import java.util.List;

import edu.hugo.back.BibliotecaPersonal.model.Autor;

public interface IAutorService {

    public List<Autor> getAutores();

    public Autor getAutorById(Long id);

    public Autor guardarOActualizarAutor(Autor autor);

    public Autor deleteAutor(Long id);

}
