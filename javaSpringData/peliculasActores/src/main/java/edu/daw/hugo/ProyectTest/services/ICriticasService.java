package edu.daw.hugo.ProyectTest.services;

import java.util.List;

import edu.daw.hugo.ProyectTest.model.Critica;

public interface ICriticasService {

    public Critica insertarCritica(Critica critica);

    public List<Critica> listarCriticas();

    public Critica listarPorId(Long id);

    public Critica modificarPorId(Critica critica);

    public void eliminarPorId(Long id);

}
