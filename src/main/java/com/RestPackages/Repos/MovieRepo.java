package com.RestPackages.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RestPackages.models.MovieDetails;

@Repository
public interface MovieRepo extends JpaRepository<MovieDetails, Integer>{

}
