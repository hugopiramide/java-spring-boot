package edu.daw.hugo.ProyectTest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daw.hugo.ProyectTest.model.Actor;
import edu.daw.hugo.ProyectTest.repositories.IActoresRepository;

@Service
public class ActoresService implements IActoresService{

    @Autowired
    private IActoresRepository actoresRepo;

    @Override
    public Actor insertarActor(Actor actor) {
        return actoresRepo.save(actor);
    }

    @Override
    public List<Actor> listaActores() {
        return actoresRepo.findAll();
    }

    @Override
    public Actor listarActorPorId(Long id) {
        return actoresRepo.findById(id).orElse(null);
    }

    @Override
    public Actor modificarPorId(Actor actor) {
        if(actoresRepo.existsById(actor.getActor_id())){
            System.err.println(
                "ERROR: No pudo modificarse el usuario."
            );
            return null;
        };
        return actoresRepo.save(actor);
    }

    @Override
    public void eliminarActorPorId(Long id) {
        actoresRepo.deleteById(id);
    }

}
