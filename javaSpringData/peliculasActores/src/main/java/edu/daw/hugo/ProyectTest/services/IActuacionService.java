package edu.daw.hugo.ProyectTest.services;

import java.util.Set;

import edu.daw.hugo.ProyectTest.model.Actuacion;

public interface IActuacionService {

    public Actuacion addActuacion(Actuacion actuacion);

    public Set<Actuacion> listarActuaciones();

    public Actuacion listarActuacionPorId(Long id);

    public Actuacion modificarActuacionId(Actuacion actuacion);

    public void eliminarActuacionPorId(Long id);
}
