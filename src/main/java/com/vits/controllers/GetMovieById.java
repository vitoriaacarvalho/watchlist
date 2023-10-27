package com.vits.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vits.models.Movie;
import com.vits.repositories.MovieRepository;

@RestController
@RequestMapping("/movies")
public class GetMovieById {
	@Autowired 
	private MovieRepository repo;
	
	@GetMapping("/{id}")
	public Optional<Movie> getMovieById(@PathVariable Integer id){
		return repo.findById(id);
	}
}
