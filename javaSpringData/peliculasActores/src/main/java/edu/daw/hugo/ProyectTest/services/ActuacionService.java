package edu.daw.hugo.ProyectTest.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daw.hugo.ProyectTest.model.Actuacion;
import edu.daw.hugo.ProyectTest.repositories.IActuacionRepository;

@Service
public class ActuacionService implements IActuacionService {

    @Autowired
    IActuacionRepository actucionRepo;

    @Override
    public Actuacion addActuacion(Actuacion actuacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addActuacion'");
    }

    @Override
    public Set<Actuacion> listarActuaciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarActuaciones'");
    }

    @Override
    public Actuacion listarActuacionPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarActuacionPorId'");
    }

    @Override
    public Actuacion modificarActuacionId(Actuacion actuacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarActuacionId'");
    }

    @Override
    public void eliminarActuacionPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarActuacionPorId'");
    }

}
