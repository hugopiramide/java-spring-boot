package edu.daw.mma.ProjectEventFight.services;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daw.mma.ProjectEventFight.DTO.EstadioDetallesDTO;
import edu.daw.mma.ProjectEventFight.mappers.EstadioDetallesMapper;
import edu.daw.mma.ProjectEventFight.model.Estadio;
import edu.daw.mma.ProjectEventFight.repositories.IEstadioRepository;

@Service
public class EstadioService implements IEstadioService {

    @Autowired
    private IEstadioRepository estadioRepo;

    @Override
    public EstadioDetallesDTO insertarEstadio(Estadio estadio) {
        estadioRepo.save(estadio);
        return EstadioDetallesMapper.toEstadioDetallesDTO(estadio);
    }

    @Override
    public Set<EstadioDetallesDTO> listarEstadios() {
        return estadioRepo.findAll().stream()
                .map(EstadioDetallesMapper::toEstadioDetallesDTO)
                .collect(Collectors.toSet());
    }

    @Override
    public EstadioDetallesDTO listarEstadioPorId(Long id) {
        return EstadioDetallesMapper.toEstadioDetallesDTO(estadioRepo.findById(id).orElse(null));
    }

    @Override
    public EstadioDetallesDTO modificarEstadioPorId(Estadio estadio) {
        if (estadioRepo.existsById(estadio.getEstadio_id())) {
            estadioRepo.save(estadio);
            return EstadioDetallesMapper.toEstadioDetallesDTO(estadio);
        }
        return null;
    }

    @Override
    public void eliminarEstadioPorId(Long id) {
        estadioRepo.deleteById(id);
    }

}
