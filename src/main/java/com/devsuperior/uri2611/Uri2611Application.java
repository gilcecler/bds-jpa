package com.devsuperior.uri2611;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.uri2611.dto.MovieMinDTO;
import com.devsuperior.uri2611.projection.MovieMinProjection;
import com.devsuperior.uri2611.repositories.MovieRepository;

@SpringBootApplication
public class Uri2611Application implements  CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(Uri2611Application.class, args);
	}
	
	@Autowired
	private MovieRepository repository;

	@Override
	public void run(String... args) throws Exception {

		List<MovieMinProjection> list = repository.search1("action");
		List<MovieMinDTO> result = list.stream().map(x -> new MovieMinDTO(x)).collect(Collectors.toList());

		System.out.println("\n*** RESULTADO SQL RAIZ");
		
		for (MovieMinDTO obj : result) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n");
		
		List<MovieMinDTO> result2 = repository.search2("action");
		
		System.out.println("\n*** RESULTADO JPQL");
		for (MovieMinDTO obj : result2) {
			System.out.println(obj);
		}
		System.out.println("\n\n\n");
		
				
	}
}
