package com.RestPackages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.RestPackages.models.BreweryProduct;

@Service
public class BreweryServiceImpl implements BreweryService{

	List<BreweryProduct> allproducts;
	
	@Override
	public List<BreweryProduct> saveProducts(List<BreweryProduct> products) {
		this.allproducts=products;
		return products;
	}

	@Override
	public List<BreweryProduct> allProducts() {
		return this.allproducts;
	}

	@Override
	public String buyProduct(int id) {
		Optional<BreweryProduct> p=this.allproducts.stream().filter((data)-> data.getProductId()==id).findAny();
		if(p.isPresent()) {
			return "Dropping the Product please take it";
		}
		return "Error not found";
	}

}
