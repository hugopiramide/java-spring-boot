package edu.daw.hugo.ProyectTest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.daw.hugo.ProyectTest.model.Critica;
import edu.daw.hugo.ProyectTest.repositories.ICriticasRepository;

public class CriticasService implements ICriticasService {

    @Autowired
    private ICriticasRepository ICriticasRepo;

    @Override
    public Critica insertarCritica(Critica critica) {
        return ICriticasRepo.save(critica);
    }

    @Override
    public List<Critica> listarCriticas() {
        return ICriticasRepo.findAll();
    }

    @Override
    public Critica listarPorId(Long id) {
        return ICriticasRepo.findById(id).orElse(null);
    }

    @Override
    public Critica modificarPorId(Critica critica) {
        if (ICriticasRepo.existsById(critica.getCritica_id())) {
            return ICriticasRepo.save(critica);
        }
        System.err.println("La Critica con ID " + critica.getCritica_id() + " no existe o no puede ser modificado.");
        return null;
    }

    @Override
    public void eliminarPorId(Long id) {
        ICriticasRepo.deleteById(id);
    }

}
