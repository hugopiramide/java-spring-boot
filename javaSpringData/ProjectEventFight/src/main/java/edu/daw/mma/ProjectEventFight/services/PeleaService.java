package edu.daw.mma.ProjectEventFight.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daw.mma.ProjectEventFight.DTO.PeleaDetallesDTO;
import edu.daw.mma.ProjectEventFight.mappers.PeleaDetallesMapper;
import edu.daw.mma.ProjectEventFight.model.Pelea;
import edu.daw.mma.ProjectEventFight.repositories.IPeleaRepository;

@Service
public class PeleaService implements IPeleaService {

    @Autowired
    private IPeleaRepository peleaRepo;

    @Override
    public PeleaDetallesDTO insertarPelea(Pelea pelea) {
        peleaRepo.save(pelea);
        return PeleaDetallesMapper.toPeleaDetallesDTO(pelea);
    }

    @Override
    public List<PeleaDetallesDTO> listarPeleas() {
        return peleaRepo.findAll().stream()
                .map(PeleaDetallesMapper::toPeleaDetallesDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PeleaDetallesDTO listarPeleaPorId(Long id) {
        return PeleaDetallesMapper.toPeleaDetallesDTO(peleaRepo.findById(id).orElse(null));
    }

    @Override
    public PeleaDetallesDTO modificarPeleaPorId(Pelea pelea) {
        if (peleaRepo.existsById(pelea.getPelea_id())) {
            peleaRepo.save(pelea);
            return PeleaDetallesMapper.toPeleaDetallesDTO(pelea);
        }
        return null;
    }

    @Override
    public void eleminarPeleaPorId(Long id) {
        peleaRepo.deleteById(id);
    }

}
