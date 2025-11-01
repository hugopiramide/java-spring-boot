package edu.daw.mma.ProjectEventFight.services;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daw.mma.ProjectEventFight.DTO.EntrenadorDetallesDTO;
import edu.daw.mma.ProjectEventFight.mappers.EntrenadorDetallesMapper;
import edu.daw.mma.ProjectEventFight.model.Entrenador;
import edu.daw.mma.ProjectEventFight.repositories.IEntrenadorRepository;

@Service
public class EntrenadorService implements IEntrenadorService {

    @Autowired
    private IEntrenadorRepository entrenadorRepo;

    @Override
    public EntrenadorDetallesDTO insertarEntrenador(Entrenador entrenador) {
        entrenadorRepo.save(entrenador);
        return EntrenadorDetallesMapper.toEntrenadorDetallesDTO(entrenador);
    }

    @Override
    public Set<EntrenadorDetallesDTO> listarEntrenadores() {
        return entrenadorRepo.findAll().stream()
                .map(EntrenadorDetallesMapper::toEntrenadorDetallesDTO)
                .collect(Collectors.toSet());
    }

    @Override
    public EntrenadorDetallesDTO listarEntrenadorPorId(Long id) {
        return EntrenadorDetallesMapper.toEntrenadorDetallesDTO(entrenadorRepo.findById(id).orElse(null));
    }

    @Override
    public EntrenadorDetallesDTO modificarEntrenadorPorId(Entrenador entrenador) {
        if (entrenadorRepo.existsById(entrenador.getEntrenador_id())) {
            entrenadorRepo.save(entrenador);
            return EntrenadorDetallesMapper.toEntrenadorDetallesDTO(entrenador);
        }
        return null;
    }

    @Override
    public void elminiarEntrenadorPorId(Long id) {
        entrenadorRepo.deleteById(id);
    }
}
