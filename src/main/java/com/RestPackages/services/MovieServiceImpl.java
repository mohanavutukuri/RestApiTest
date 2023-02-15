package com.RestPackages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestPackages.Repos.MovieRepo;
import com.RestPackages.models.MovieDetails;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieRepo repo;
	@Override
	public List<MovieDetails> saveall(List<MovieDetails> detailsList) {
		return repo.saveAll(detailsList);
	}
	@Override
	public List<MovieDetails> getall() {
		return repo.findAll();
	}

}
