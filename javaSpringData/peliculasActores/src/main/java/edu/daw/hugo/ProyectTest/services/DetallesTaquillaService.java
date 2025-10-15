package edu.daw.hugo.ProyectTest.services;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daw.hugo.ProyectTest.model.DetallesTaquilla;
import edu.daw.hugo.ProyectTest.repositories.IDetallesTaquillaRepository;

@Service
public class DetallesTaquillaService implements IDetallesTaquillaService {

    @Autowired
    IDetallesTaquillaRepository IDetallesTaquillaRepo;

    @Override
    public DetallesTaquilla insertarDetallesTaquilla(DetallesTaquilla detallesTaquilla) {
        return IDetallesTaquillaRepo.save(detallesTaquilla);
    }

    @Override
    public DetallesTaquilla listarDetallesTaquillaPorId(Long id) {
        return IDetallesTaquillaRepo.findById(id).orElse(null);
    }

    @Override
    public Set<DetallesTaquilla> listarDetallesTaquillas() {
        return IDetallesTaquillaRepo.findAll()
                .stream()
                .collect(Collectors.toSet());
    }

    @Override
    public DetallesTaquilla modificarDetallesTaquilla(DetallesTaquilla detallesTaquilla) {
        if (IDetallesTaquillaRepo.existsById(detallesTaquilla.getTaquilla_id())) {
            return IDetallesTaquillaRepo.save(detallesTaquilla);
        }
        return null;
    }

    @Override
    public void eliminarDetallesTaquillaPorId(Long id) {
    }

}
