package edu.daw.hugo.ProyectTest.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daw.hugo.ProyectTest.DTO.ActorDetallesDTO;
import edu.daw.hugo.ProyectTest.mappers.ActorDetallesMapper;
import edu.daw.hugo.ProyectTest.model.Actor;
import edu.daw.hugo.ProyectTest.repositories.IActoresRepository;

@Service
public class ActoresService implements IActoresService {

    @Autowired
    private IActoresRepository actoresRepo;

    @Override
    public Actor insertarActor(Actor actor) {
        return actoresRepo.save(actor);
    }

    @Override
    public List<ActorDetallesDTO> listaActores() {
        return actoresRepo.findAll().stream()
                .map(ActorDetallesMapper::toActorDetallesDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ActorDetallesDTO listarActorPorId(Long id) {
        Actor actor = actoresRepo.findById(id).orElse(null);
        return ActorDetallesMapper.toActorDetallesDTO(actor);
    }

    @Override
    public Actor modificarPorId(Actor actor) {
        if (actoresRepo.existsById(actor.getActor_id())) {
            return actoresRepo.save(actor);
        }
        System.err.println(
                "ERROR: No pudo modificarse el usuario.");
        return null;
    }

    @Override
    public void eliminarActorPorId(Long id) {
        actoresRepo.deleteById(id);
    }
}