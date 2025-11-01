package edu.daw.mma.ProjectEventFight.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.daw.mma.ProjectEventFight.DTO.Contrato_luchador_entrenadorDetallesDTO;
import edu.daw.mma.ProjectEventFight.mappers.Contrato_luchador_entrenadorDetallesMapper;
import edu.daw.mma.ProjectEventFight.model.Contrato_luchador_entrenador;
import edu.daw.mma.ProjectEventFight.repositories.IContrato_luchador_entrenadorRepository;

@Service
public class Contrato_luchador_entrenadorService implements IContrato_luchador_entrenadorService {

    @Autowired
    private IContrato_luchador_entrenadorRepository contratoRepo;

    @Override
    public Contrato_luchador_entrenadorDetallesDTO inserContrato_luchador_entrenador(
            Contrato_luchador_entrenador contrato_luchador_entrenador) {
        contratoRepo.save(contrato_luchador_entrenador);
        return Contrato_luchador_entrenadorDetallesMapper
                .toContrato_luchador_entrenadorDetallesDTO(contrato_luchador_entrenador);
    }

    @Override
    public List<Contrato_luchador_entrenadorDetallesDTO> listarContratos_luchador_entrenador() {
        return contratoRepo.findAll().stream()
                .map(Contrato_luchador_entrenadorDetallesMapper::toContrato_luchador_entrenadorDetallesDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Contrato_luchador_entrenadorDetallesDTO listaContrato_luchador_entrenadorPorId(Long id) {
        return Contrato_luchador_entrenadorDetallesMapper
                .toContrato_luchador_entrenadorDetallesDTO(contratoRepo.findById(id).orElse(null));
    }

    @Override
    public Contrato_luchador_entrenadorDetallesDTO modificarContrato_luchador_entrenador(
            Contrato_luchador_entrenador contrato_luchador_entrenador) {
        if (contratoRepo.existsById(contrato_luchador_entrenador.getContrato_id())) {
            contratoRepo.save(contrato_luchador_entrenador);
            return Contrato_luchador_entrenadorDetallesMapper
                    .toContrato_luchador_entrenadorDetallesDTO(contrato_luchador_entrenador);
        }
        return null;
    }

    @Override
    public void eliminarContrato_luchador_entrenadorPorId(Long id) {
        contratoRepo.deleteById(id);
    }

}
