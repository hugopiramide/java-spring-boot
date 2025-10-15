package edu.daw.hugo.ProyectTest.services;

import java.util.Set;

import org.springframework.stereotype.Service;

import edu.daw.hugo.ProyectTest.model.DetallesTaquilla;

@Service
public interface IDetallesTaquillaService {

    public DetallesTaquilla insertarDetallesTaquilla(DetallesTaquilla detallesTaquilla);

    public DetallesTaquilla listarDetallesTaquillaPorId(Long id);

    public Set<DetallesTaquilla> listarDetallesTaquillas();

    public DetallesTaquilla modificarDetallesTaquilla(DetallesTaquilla detallesTaquilla);

    public void eliminarDetallesTaquillaPorId(Long id);
}
