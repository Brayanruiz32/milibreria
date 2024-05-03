package com.libros.milibreria;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MilibreriaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MilibreriaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal miPrincipal = new Principal();
		miPrincipal.ejecucionPrincipal();
			

	}

	
	

}
