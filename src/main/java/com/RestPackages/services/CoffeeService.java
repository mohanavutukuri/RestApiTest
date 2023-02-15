package com.RestPackages.services;

import org.springframework.stereotype.Service;

import com.RestPackages.models.Ingrediants;

@Service
public class CoffeeService implements CoffeeServiceInterface{

	@Override
	public Ingrediants makeProduct(String product) {
		Ingrediants ing=null;
		switch (product) {
		case "water":
			ing=new Ingrediants(0,0,5,0.0f,0.25f);
			break;
		case "milk":
			ing=new Ingrediants(0,0,15,0.2f,0.05f);
			break;
		case "steam":
			ing=new Ingrediants(0,0,10,0.0f,0.02f);
			break;
		case "cappacino":
			ing=new Ingrediants(10,0,20,0.2f,0.02f);
			break;
		case "espresso":
			ing=new Ingrediants(20,0,20,0.2f,0.02f);
			break;
		case "latte":
			ing=new Ingrediants(20,0,35,0.2f,0.02f);
			break;
		default:
			ing=new Ingrediants(0,0,0,0.0f,0.0f);
			break;
		}
		return ing;
	}
	
}
