package edu.daw.hugo.ProyectTest.services;

import edu.daw.hugo.ProyectTest.DTO.ActorDetallesDTO;
import edu.daw.hugo.ProyectTest.model.Actor;

import java.util.List;

public interface IActoresService {

    // CRRUD
    public Actor insertarActor(Actor actor);

    public List<ActorDetallesDTO> listaActores();

    public ActorDetallesDTO listarActorPorId(Long id);

    public Actor modificarPorId(Actor actor);

    public void eliminarActorPorId(Long id);
}
