package edu.daw.hugo.ProyectTest.services;

import java.util.List;

import edu.daw.hugo.ProyectTest.model.Pelicula;

public interface IPeliculasService {

    // CRRUD
    public Pelicula insertarPelicula(Pelicula pelicula);

    public List<Pelicula> listaPeliculas();

    public Pelicula listarPeliculaPorId(Long id);

    public Pelicula modificarPeliculaPorId(Pelicula pelicula);

    public void eliminarPeliculaPorId(Long id);
}
