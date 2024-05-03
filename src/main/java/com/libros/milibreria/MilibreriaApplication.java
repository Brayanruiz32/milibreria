package com.libros.milibreria;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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
