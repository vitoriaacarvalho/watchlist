package com.vits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vits.models.Movie;
import com.vits.repositories.MovieRepository;

@RestController
@RequestMapping("/movies")
public class ListMovies {
	@Autowired
	private MovieRepository repo;
	
	@GetMapping
	public Iterable<Movie> getAllUnwatchedMovies(){
		return repo.findByAlreadyWatchedFalse();
	}
	
	@GetMapping("/all")
	public Iterable<Movie> getAllMovies(){
		return repo.findAll();
	}
}
