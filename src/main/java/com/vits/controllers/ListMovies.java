package com.vits.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vits.models.Movie;
import com.vits.repositories.MovieRepository;

@Controller
@RequestMapping("/movies")
public class ListMovies {
	@Autowired
	private MovieRepository repo;

	@GetMapping("/unwatched")
	public Iterable<Movie> getAllUnwatchedMovies() {
		return repo.findByAlreadyWatchedFalse();
	}

	@GetMapping
	public String getAllMovies(Model model) {
		List<Movie> allMovies =repo.findAll();
		System.out.print(allMovies);
		model.addAttribute("movieList", allMovies);
		return "list";
	}
}
