package com.vits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vits.models.Movie;
import com.vits.repositories.MovieRepository;

@RestController
@RequestMapping("/movies")
public class DeleteMovie {
	@Autowired
	private MovieRepository repo;

	@DeleteMapping("/{id}")
	public ResponseEntity<Movie> deleteMovie(@PathVariable Integer id){
		repo.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
