package com.RestPackages.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestPackages.models.BreweryProduct;
import com.RestPackages.services.BreweryService;

@RestController
@RequestMapping("/brewery")
public class BreweryController {
	@Autowired
	private BreweryService service;
	
	@PostMapping("/addproducts")
	public List<BreweryProduct> addProducts(){
		List<BreweryProduct> products=new ArrayList<>();
		for(int i=1;i<11;i++) {
			products.add(new BreweryProduct(i,"product"+i,i*10));
		}
		return service.saveProducts(products);
	}
	
	@GetMapping("/allproducts")
	public List<BreweryProduct> allProducts(){
		return service.allProducts();
	}
	
	@PutMapping("/selectproduct/{id}")
	public String buyProduct(@PathVariable int id) {
		return service.buyProduct(id);
	}
}
