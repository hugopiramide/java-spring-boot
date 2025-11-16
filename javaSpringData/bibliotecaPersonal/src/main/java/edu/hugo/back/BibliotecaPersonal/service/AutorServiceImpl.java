package edu.hugo.back.BibliotecaPersonal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import edu.hugo.back.BibliotecaPersonal.model.Autor;
import edu.hugo.back.BibliotecaPersonal.repository.IAutorRepository;
import edu.hugo.back.BibliotecaPersonal.service.interfaces.IAutorService;

public class AutorServiceImpl implements IAutorService {

    @Autowired
    private IAutorRepository autorRepo;

    /*
     * private IAutorRepository autoRepo;
     * 
     * public AutorServiceImpl(IAutorRepository autorRepo){
     * this.autorRepo = autorRepo;
     * }
     */

    @Override
    public List<Autor> getAutores() {

    }

    @Override
    public Autor getAutorById(Long id) {

    }

    @Override
    public Autor guardarOActualizarAutor(Autor autor) {

    }

    @Override
    public Autor deleteAutor(Long id) {

    }

}
