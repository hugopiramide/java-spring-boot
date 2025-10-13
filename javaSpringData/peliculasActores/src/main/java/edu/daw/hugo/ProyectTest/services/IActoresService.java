package edu.daw.hugo.ProyectTest.services;

import edu.daw.hugo.ProyectTest.model.Actor;

import java.util.List;

public interface IActoresService {

    // CRRUD
    public Actor insertarActor(Actor actor);

    public List<Actor> listaActores();

    public Actor listarActorPorId(Long id);

    public Actor modificarPorId(Actor actor);

    public void eliminarActorPorId(Long id);
}
