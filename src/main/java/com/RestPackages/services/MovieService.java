package com.RestPackages.services;

import java.util.List;

import com.RestPackages.models.MovieDetails;

public interface MovieService {
	public List<MovieDetails> saveall(List<MovieDetails> detailsList);
	public List<MovieDetails> getall();
}
