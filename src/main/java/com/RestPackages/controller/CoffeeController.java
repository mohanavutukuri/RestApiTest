package com.RestPackages.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.RestPackages.models.Ingrediants;
import com.RestPackages.services.CoffeeServiceInterface;

@RestController
public class CoffeeController {
	
	@Autowired
	private CoffeeServiceInterface service;
	
	@GetMapping("/dispense/{ingrediant}")
	public Ingrediants dispence(@PathVariable String ingrediant) {
		return service.makeProduct(ingrediant);
		
	}
}
