package edu.daw.mma.ProjectEventFight.services;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daw.mma.ProjectEventFight.DTO.LuchadorDetallesDTO;
import edu.daw.mma.ProjectEventFight.mappers.LuchadorDetallesMapper;
import edu.daw.mma.ProjectEventFight.model.Luchador;
import edu.daw.mma.ProjectEventFight.repositories.ILuchadorRepository;

@Service
public class LuchadorService implements ILuchadorService {

    @Autowired
    private ILuchadorRepository luchadorRepo;

    @Override
    public LuchadorDetallesDTO insertarLuchador(Luchador luchador) {
        luchadorRepo.save(luchador);
        return LuchadorDetallesMapper.toLuchadorDetallesDTO(luchador);
    }

    @Override
    public Set<LuchadorDetallesDTO> listarLuchadores() {
        return luchadorRepo.findAll().stream()
                .map(LuchadorDetallesMapper::toLuchadorDetallesDTO)
                .collect(Collectors.toSet());
    }

    @Override
    public LuchadorDetallesDTO listarLuchadorPorId(Long id) {
        return LuchadorDetallesMapper.toLuchadorDetallesDTO(luchadorRepo.findById(id).orElse(null));
    }

    @Override
    public LuchadorDetallesDTO modificarLuchadorPorId(Luchador luchador) {
        if (luchadorRepo.existsById(luchador.getLuchador_id())) {
            luchadorRepo.save(luchador);
            return LuchadorDetallesMapper.toLuchadorDetallesDTO(luchador);
        }
        return null;
    }

    @Override
    public void eliminarLuchadorPorId(Long id) {
        luchadorRepo.deleteById(id);
    }

}
