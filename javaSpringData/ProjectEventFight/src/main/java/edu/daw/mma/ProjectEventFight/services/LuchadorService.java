package edu.daw.mma.ProjectEventFight.services;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daw.mma.ProjectEventFight.DTO.LuchadorResumenDTO;
import edu.daw.mma.ProjectEventFight.mappers.LuchadorResumenMapper;
import edu.daw.mma.ProjectEventFight.model.Luchador;
import edu.daw.mma.ProjectEventFight.repositories.ILuchadorRepository;

@Service
public class LuchadorService implements ILuchadorService {

    @Autowired
    private ILuchadorRepository luchadorRepo;

    @Override
    public LuchadorResumenDTO insertarLuchador(Luchador luchador) {
        luchadorRepo.save(luchador);
        return LuchadorResumenMapper.toLuchadorResumenDTO(luchador);
    }

    @Override
    public Set<LuchadorResumenDTO> listarLuchadores() {
        return luchadorRepo.findAll().stream()
                .map(LuchadorResumenMapper::toLuchadorResumenDTO)
                .collect(Collectors.toSet());
    }

    @Override
    public LuchadorResumenDTO listarLuchadorPorId(Long id) {
        return LuchadorResumenMapper.toLuchadorResumenDTO(luchadorRepo.findById(id).orElse(null));
    }

    @Override
    public LuchadorResumenDTO modificarLuchadorPorId(Luchador luchador) {
        if (luchadorRepo.existsById(luchador.getLuchador_id())) {
            luchadorRepo.save(luchador);
            return LuchadorResumenMapper.toLuchadorResumenDTO(luchador);
        }
        return null;
    }

    @Override
    public void eliminarLuchadorPorId(Long id) {
        luchadorRepo.deleteById(id);
    }

    @Override
    public List<LuchadorResumenDTO> buscarLuchadoresPorNombre(String nombre) {
        return luchadorRepo.filtrarLuchadoresPorNombre(nombre).stream()
                .map(LuchadorResumenMapper::toLuchadorResumenDTO)
                .collect(Collectors.toList());
    }
}
