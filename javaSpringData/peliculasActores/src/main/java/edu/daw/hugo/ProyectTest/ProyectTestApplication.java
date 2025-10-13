package edu.daw.hugo.ProyectTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.daw.hugo.ProyectTest.services.IActoresService;
import edu.daw.hugo.ProyectTest.services.ICriticasService;
import edu.daw.hugo.ProyectTest.services.IPeliculasService;

@SpringBootApplication
public class ProyectTestApplication implements CommandLineRunner {

	@Autowired
	private IActoresService actoresService;

	@Autowired
	private IPeliculasService peliculasService;

	@Autowired
	private ICriticasService criticasService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectTestApplication.class, args);
	}

	public void run(String... args) throws Exception {

	}
}
