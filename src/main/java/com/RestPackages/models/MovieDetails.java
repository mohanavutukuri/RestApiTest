package com.RestPackages.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="movie")
public class MovieDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String name;
	private String genre;
	private float cost;
	
	public MovieDetails(String name, String genre, float cost) {
		super();
		this.name = name;
		this.genre = genre;
		this.cost = cost;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public MovieDetails(int id, String name, String genre, float cost) {
		super();
		Id = id;
		this.name = name;
		this.genre = genre;
		this.cost = cost;
	}
	public MovieDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MovieDetails [Id=" + Id + ", name=" + name + ", genre=" + genre + ", cost=" + cost + "]";
	}
	
	
}
