package com.RestPackages.services;

import java.util.List;

import com.RestPackages.models.BreweryProduct;

public interface BreweryService {
	List<BreweryProduct> saveProducts(List<BreweryProduct> products);
	List<BreweryProduct> allProducts();
	String buyProduct(int id);
}
