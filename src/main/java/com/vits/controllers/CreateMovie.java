package com.vits.controllers;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vits.models.Movie;
import com.vits.repositories.MovieRepository;

@RestController
@RequestMapping("/movies")
public class CreateMovie {
	@Autowired
	private MovieRepository repo;
	
	@PostMapping
	public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
		getCurrentDate(movie);
		setMovieAsUnwatched(movie);
		repo.save(movie);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	private void getCurrentDate(Movie movie) {
		LocalDateTime currentDate = LocalDateTime.now();
		movie.setCreationDate(currentDate);
	}
	
	private void setMovieAsUnwatched(Movie movie) {
		movie.setAlreadyWatched(false);
	}
	
}
