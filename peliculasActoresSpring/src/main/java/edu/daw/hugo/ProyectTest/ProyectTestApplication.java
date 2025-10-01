package edu.daw.hugo.ProyectTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.daw.hugo.ProyectTest.services.IActoresService;
import edu.daw.hugo.ProyectTest.services.IPeliculasService;

@SpringBootApplication
public class ProyectTestApplication {

	@Autowired
	private IActoresService actoresService;
	
	@Autowired
	private IPeliculasService peliculasService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectTestApplication.class, args);
	}
}
