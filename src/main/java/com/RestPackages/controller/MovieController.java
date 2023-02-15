package com.RestPackages.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestPackages.models.MovieDetails;
import com.RestPackages.services.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	private MovieService service;
	
	@PostMapping("/addmovies")
	public List<MovieDetails> saveAllMovies(){
		List<MovieDetails> moviesList=new ArrayList<>();
		moviesList.add(new MovieDetails("21st century girl","drama",200.0f));
		moviesList.add(new MovieDetails("Pathaan","action-comedy",99.99f));
		moviesList.add(new MovieDetails("avatar","action",149.99f));
		moviesList.add(new MovieDetails("hera pheri","drama",49.99f));
		moviesList.add(new MovieDetails("rrr","action-drama",129.99f));
		moviesList.add(new MovieDetails("suryavamsham","action-drama",29.99f));
		moviesList.add(new MovieDetails("kgf chapter1","action",139.99f));
		moviesList.add(new MovieDetails("kgf chapter2","action",159.99f));
		moviesList.add(new MovieDetails("one piece","horror",39.99f));
		moviesList.add(new MovieDetails("friends","drama",19.99f));
		moviesList.add(new MovieDetails("avengers","action",129.99f));
		moviesList.add(new MovieDetails("harry poter","action",129.99f));
		return service.saveall(moviesList);
	}
	
	@GetMapping("/allmovies")
	public List<MovieDetails> getallmovies(){
		return service.getall();
	}
	
	@PostMapping("/buymovie/{movieId}")
	public String buymovie(@PathVariable int movieId) {
		return "Movie Payment Successful";
	}
}
