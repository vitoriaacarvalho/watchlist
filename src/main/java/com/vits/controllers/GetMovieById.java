package com.vits.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vits.models.Movie;
import com.vits.repositories.MovieRepository;

@Controller
@RequestMapping("/movies")
public class GetMovieById {
	@Autowired 
	private MovieRepository repo;
	
	@GetMapping("/{id}")
	public String getMovieById(@PathVariable Integer id, Model model){
		Optional<Movie> movieOptional = repo.findById(id);
		if (movieOptional.isPresent()) {
		    Movie movie = movieOptional.get(); 
		    model.addAttribute("movie", movie);
		    return "tv-by-id";
		}
		else {
			return "index";
		}
	}
}
