package edu.daw.hugo.ProyectTest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daw.hugo.ProyectTest.model.Pelicula;
import edu.daw.hugo.ProyectTest.repositories.IPeliculasRepository;

@Service
public class PeliculasService implements IPeliculasService{

    @Autowired
    private IPeliculasRepository peliculasRepo;

    @Override
    public Pelicula insertarPelicula(Pelicula pelicula) {
        return peliculasRepo.save(pelicula);
    }

    @Override
    public List<Pelicula> listaPeliculas() {
        return peliculasRepo.findAll();
    }

    @Override
    public Pelicula modificarPeliculaPorId(Pelicula pelicula) {
        if(peliculasRepo.existsById(pelicula.getPelicula_id())){
            return peliculasRepo.save(pelicula);
        }
        System.err.println("ERROR: No se pudo modificar la pelicula");
        return null;
    }

    @Override
    public void eliminarPeliculaPorId(Long id) {
        peliculasRepo.deleteById(id);
    }

    @Override
    public Pelicula listarPeliculaPorId(Long id) {
        return peliculasRepo.findById(id).orElse(null);
    }
    
}
