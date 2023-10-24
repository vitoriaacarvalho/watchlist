package com.vits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vits.models.Movie;
import com.vits.repositories.MovieRepository;

@RestController
@RequestMapping("/movies")
public class UpdateMovie {
	@Autowired
	private MovieRepository repo;
	
	@PutMapping("/{id}")
	public ResponseEntity<Movie> updateMovie(@PathVariable Integer id, @RequestBody Movie movie){
		Movie updatedMovie = repo.findById(id).get();
		updatedMovie.setComments(movie.getComments());
		updatedMovie.setHowMuchWeWannaSeeIt(movie.getHowMuchWeWannaSeeIt());
		updatedMovie.setName(movie.getName());
		updatedMovie.setOwner(movie.getOwner());
		updatedMovie.setAlreadyWatched(movie.getAlreadyWatched());
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
