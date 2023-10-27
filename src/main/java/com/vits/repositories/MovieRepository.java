package com.vits.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vits.models.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer>{
	List<Movie> findAll();
	List<Movie> findByAlreadyWatchedFalse();
}
