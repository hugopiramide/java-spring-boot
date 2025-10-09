package edu.daw.hugo.ProyectTest;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.daw.hugo.ProyectTest.model.Actor;
import edu.daw.hugo.ProyectTest.model.Pelicula;
import edu.daw.hugo.ProyectTest.model.genero.Genero;
import edu.daw.hugo.ProyectTest.services.IActoresService;
import edu.daw.hugo.ProyectTest.services.IPeliculasService;

@SpringBootApplication
public class ProyectTestApplication implements CommandLineRunner{

	@Autowired
	private IActoresService actoresService;
	
	@Autowired
	private IPeliculasService peliculasService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectTestApplication.class, args);
	}
	
	public void run(String... args)throws Exception{
		System.out.println('m');
		
		Pelicula film = new Pelicula("8 Apellidos Corunheses", Genero.CIENCIA_FICCION, "2h", "2006-03-12");
		Actor act = new Actor("Hugo","del Castillo Deus",LocalDate.of(2000, 8, 25),true);
		
		System.out.println("LISTAR ACTORES:");
		actoresService.listaActores().forEach(System.out::println);

		System.out.println("INSERTAR ACTORES:");
		actoresService.insertarActor(act);

		System.out.println("LISTAR ACTORES:");
		actoresService.listaActores().forEach(System.out::println);

		System.out.println("MODIFICAR ACTOR:");
		act.setApellido("del Palacio");
		actoresService.modificarPorId(act);

		System.out.println("ELIMINAR ACTOR:");
		actoresService.eliminarActorPorId(act.getActor_id());
	}
}
