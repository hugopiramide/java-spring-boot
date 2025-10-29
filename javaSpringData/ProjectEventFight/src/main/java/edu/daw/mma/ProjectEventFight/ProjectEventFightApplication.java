package edu.daw.mma.ProjectEventFight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.daw.mma.ProjectEventFight.services.IContrato_luchador_entrenadorService;
import edu.daw.mma.ProjectEventFight.services.IEntrenadorService;
import edu.daw.mma.ProjectEventFight.services.IEstadioService;
import edu.daw.mma.ProjectEventFight.services.ILuchadorService;
import edu.daw.mma.ProjectEventFight.services.IPeleaService;

@SpringBootApplication
public class ProjectEventFightApplication implements CommandLineRunner {

	@Autowired
	private IEntrenadorService entrenadorService;

	@Autowired
	private ILuchadorService luchadorService;

	@Autowired
	private IEstadioService estdioService;

	@Autowired
	private IPeleaService peleaService;

	@Autowired
	private IContrato_luchador_entrenadorService contratoService;

	public static void main(String[] args) {
		SpringApplication.run(ProjectEventFightApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
